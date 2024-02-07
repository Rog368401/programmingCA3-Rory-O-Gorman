package src;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Name:
 *  Class Group:
 */

public class CA3_Question5
{
    public static void airport(){
        Queue<String> takeOff = new LinkedList<String>();
        Queue<String> land = new LinkedList<String>();
        System.out.println("What would you like to do?");
        System.out.println(" 1- Enter flight for takeOff");
        System.out.println(" 2- Enter flight for landing");
        System.out.println("3- show takeOff Queue");
        System.out.println("4- show Landing Queue");
        System.out.println("5- Quit");
    }


    public static void main(String[] args)
    {

    }
}
