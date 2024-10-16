import java.util.Scanner;

public class Fishmonger {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        System.out.println("1. Salmon\n2. Tuna\n3. Lobster\ninput:");
        int choice41 = input.nextInt();

        System.out.println("How much?\ninput:");
        int choice42 = input.nextInt();

        System.out.println("where do you go next?\n1. Next Shop\n2. Go Home\ninput:");
        int choice43 = input.nextInt();
    }
}
