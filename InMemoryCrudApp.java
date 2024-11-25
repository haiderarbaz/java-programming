import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class User {
    private int id;
    private String name;
    private String email;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}

public class InMemoryCrudApp {
    private final List<User> users = new ArrayList<>();
    private int nextId = 1;

    // Create a new user
    public void createUser(String name, String email) {
        User user = new User(nextId++, name, email);
        users.add(user);
        System.out.println("User created: " + user);
    }

    // Read all users
    public void readUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            users.forEach(System.out::println);
        }
    }

    // Update a user's information
    public void updateUser(int id, String name, String email) {
        Optional<User> userOpt = users.stream().filter(u -> u.getId() == id).findFirst();
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setName(name);
            user.setEmail(email);
            System.out.println("User updated: " + user);
        } else {
            System.out.println("User not found.");
        }
    }

    // Delete a user
    public void deleteUser(int id) {
        Optional<User> userOpt = users.stream().filter(u -> u.getId() == id).findFirst();
        if (userOpt.isPresent()) {
            users.remove(userOpt.get());
            System.out.println("User deleted.");
        } else {
            System.out.println("User not found.");
        }
    }

public class CrudApp
    // Main method for interaction
{
    public static void main(String[] args) {
        InMemoryCrudApp app = new InMemoryCrudApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1: Create User");
            System.out.println("2: Read Users");
            System.out.println("3: Update User");
            System.out.println("4: Delete User");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    app.createUser(name, email);
                    break;
                case 2:
                    app.readUsers();
                    break;
                case 3:
                    System.out.print("Enter user ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new name: ");
                    String newName = scanner.next();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.next();
                    app.updateUser(updateId, newName, newEmail);
                    break;
                case 4:
                    System.out.print("Enter user ID to delete: ");
                    int deleteId = scanner.nextInt();
                    app.deleteUser(deleteId);
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
}