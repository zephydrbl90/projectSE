import java.util.Scanner;

public class VegetableVendor {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        System.out.println("1. Broccoli\n2. Pea\n3. Onion\ninput:");
        int choice31 = input.nextInt();

        System.out.println("How much?\ninput:");
        int choice32 = input.nextInt();

        System.out.println("where do you go next?\n1. Next Shop\n2. Go Home\ninput:");
        int choice33 = input.nextInt();
    }
}
