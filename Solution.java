//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

public class Solution {
    static void nextPermutation(int[] arr) {
        // code here
        List<int[]> res = new ArrayList<>();

        permutations(res, arr, 0);
        Collections.sort(res, Arrays::compare);
      
        // Traverse to find next permutation
        for (int i = 0; i < res.size(); i++) {
          
            // Found a match
            if (Arrays.equals(res.get(i), arr)) {
              
                // Store the next in arr
                if (i < res.size() - 1) {
                    int[] nextPerm = res.get(i + 1);
                    for(int j = 0; j < arr.length; j++)
                        arr[j] = nextPerm[j];
                }
              
                // If the given permutation is the last
                if (i == res.size() - 1) {
                    int[] nextPerm = res.get(0);
                    for(int j = 0; j < arr.length; j++)
                        arr[j] = nextPerm[j];
                }
                
                break;
            }
        }
    }

    // Generate permutations recursively
    static void permutations(List<int[]> res, int[] arr, int idx) {
      
        // Base case: if idx reaches the end of the array
        if (idx == arr.length - 1) {
            res.add(arr.clone());
            return;
        }
      
        // Permutations made by swapping each element
        // starting from index `idx`
        for (int i = idx; i < arr.length; i++) {
          
            // Swapping
            swap(arr, idx, i);
          
            // Recursive call to create permutations
            // for the next element
            permutations(res, arr, idx + 1);
          
            // Backtracking
            swap(arr, idx, i);  
        }
    }
  
    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};  
        nextPermutation(arr);
        
        for (int num : arr)
            System.out.print(num + " ");
    }
}

//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}