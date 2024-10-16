import java.nio.channels.Pipe.SourceChannel;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] Result1 ={0,0};
        int[] Result2 ={0,0};
        int i = -1;

        String[] order = {"Apple","Manggo","Orange","Broccoli","Pea","Onion","Salmon","Tuna","Lobster"};

        int RN1 = rand.nextInt(9);
        int RN2 = rand.nextInt(9);

        String Aorder = order[RN1];
        String Border = order[RN2];

        int Corder1 = rand.nextInt(3)+1;
        int Corder2 = rand.nextInt(3)+1;

        while (Border == Aorder){
            Border = order[rand.nextInt(9)];
        };

        System.out.println ("Mom told you to buy : "+Aorder+" "+Corder1+" and "+Border+" "+Corder2);


        while(true){
            i++;
            System.out.println("Do you want to go to?:\n1. FruitVendor\n2. VagetableVendor\n3. Fishmonger\ninput:");
            int choice11 = input.nextInt();
            int choice1 = choice11;
            if(choice1 == 1){
                System.out.println("What do you want to buy?");
                System.out.println("1. Apple\n2. Manggo\n3. Orange\ninput:");
                int choice21 = input.nextInt();
                Result1[i] = choice21;

                System.out.println("How much?\ninput:");
                int choice22 = input.nextInt();
                Result2[i] = choice22;


                System.out.println("where do you go next?\n1. Next Shop\n2. Go Home\ninput:");
                int choice23 = input.nextInt();
                if(choice23 == 2){
                    choice11 = 0;
                    break;
                }
            }else if(choice1 == 2){
                System.out.println("What do you want to buy?");
                System.out.println("1. Broccoli\n2. Pea\n3. Onion\ninput:");
                int choice31 = input.nextInt();
                Result1[i] = choice31+3;

                System.out.println("How much?\ninput:");
                int choice32 = input.nextInt();
                Result2[i] = choice32;


                System.out.println("where do you go next?\n1. Next Shop\n2. Go Home\ninput:");
                int choice33 = input.nextInt();
                if(choice33 == 2){
                    choice11 = 0;
                    break;
                }
            }else{
                System.out.println("What do you want to buy?");
                System.out.println("1. Salmon\n2. Tuna\n3. Lobster\ninput:");
                int choice41 = input.nextInt();
                Result1[i] = choice41+6;

                System.out.println("How much?\ninput:");
                int choice42 = input.nextInt();
                Result2[i] = choice42;


                System.out.println("where do you go next?\n1. Next Shop\n2. Go Home\ninput:");
                int choice43 = input.nextInt();
                if(choice43 == 2){
                    choice11 = 0;
                    break;
                }
            } 
        }

        if (((RN1+=1) == Result1[0]) && ((RN2+=1) == Result1[1]) && (Corder1 == Result2[0]) && (Corder2 == Result2[1])){
            System.out.println("Your mom happy because your order was right");
        }
        else{
            System.out.println("Your mom anggry because your order was wrong");
        }
    }
}