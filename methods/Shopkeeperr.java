import java.util.Scanner;

class Shopkeeper{
    public String getMeANoteBook(int cost){
        if(cost>=75)
        return "NoteBook";
        else
        return "Pay More";
    }
    public String getMeAPen(int cost){
        if(cost>=15)
        return "Pen";
        else
        return "You have to pay minimum 15 Rupees";
    }
    public String getMeADrink(int cost){
        if (cost>=25) {
            return "Campa";
        }
        else
        return "Pay 25 rupees to get a Campa";
    }
}

public class Shopkeeperr {
    public static void main(String[] args)
    {

        Shopkeeper shop=new Shopkeeper();

        String str=shop.getMeANoteBook(55);
        System.out.println(str);
        String str0=shop.getMeAPen(10);
        System.out.println(str0);
        String str1=shop.getMeADrink(20);
        System.out.println(str1);
    }
}
