import java.util.Scanner;

public class FruitVendor {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        System.out.println("1. Apple\n2. Manggo\n3. Orange\ninput:");
        int choice21 = input.nextInt();

        System.out.println("How much?\ninput:");
        int choice22 = input.nextInt();

        System.out.println("where do you go next?\n1. Next Shop\n2. Go Home\ninput:");
        int choice23 = input.nextInt();
    }
}
