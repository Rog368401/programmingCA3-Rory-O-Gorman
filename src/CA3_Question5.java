package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *  Name:
 *  Class Group:
 */

public class CA3_Question5
{
    public static void airport(){
        Scanner kbrd = new Scanner(System.in);
        Queue<String> takeOff = new LinkedList<String>();
        Queue<String> land = new LinkedList<String>();
        int choice;
        do {


            System.out.println("What would you like to do?");
            System.out.println(" 1- Enter flight for takeOff");
            System.out.println(" 2- Enter flight for landing");
            System.out.println("0- Quit");

            choice = kbrd.nextInt();

            switch (choice) {
                case 0:{
                    System.out.println("Take off queue = " +
                            takeOff );
                    System.out.println("Landing queue = " + land);
                }
                break;
                case 1: {
                    System.out.println("Please enter flight number");
                    takeOff.add(kbrd.next());
                    System.out.println("flights ready for takeOff " + takeOff);
                }
                break;
                case 2: {
                    System.out.println("Please enter flight number");
                    land.add(kbrd.next());
                    System.out.println("flights to land " + land);
                }
            }
        } while (choice > 0);
    }


    public static void main(String[] args)
    {
        airport();
    }
}
