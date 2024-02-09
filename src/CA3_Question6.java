package src;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question6
{

    /*
    Will repeatedly ask the user to enter the commands in the format
    buy qty price
    or
    sell qty price
    or
    quit
     */
    public static void main(String[] args) {
        Queue<Integer> shares = new LinkedList<>();
        Queue<Integer> gain = new LinkedList<>();
        double total = 0;
       Scanner in = new Scanner(System.in);
        String command="";
            do {
                System.out.println("Would you like to Buy, Sell or Quit");
            System.out.print(">");
            command = in.next();
            if(command.equalsIgnoreCase("buy"))
            {
                System.out.println("How many shares would you like to buy");
                int qty = in.nextInt();
                System.out.println("How much do they cost per share");
                double price = in.nextDouble();
                total = total+(price * qty);
                shares.add(qty);

                System.out.println( "current shares " + shares + "Total spent " + total);
            }
            else if(command.equals("sell"))
            {
                int qty = in.nextInt();
                double price = in.nextDouble();


            }
        }while(!command.equalsIgnoreCase("quit"));
        System.out.println(shares);
    }
}