import java.util.Scanner;
import java.util.Stack;

/**
 *  Name: Rory O'Gorman
 *  Class Group: SD2B
 */
public class CA3_Question1
{
    public static void runSimulation()
    {
        driveway();

    }
    public static void driveway() {

        Scanner kbrd = new Scanner(System.in);
        Stack<Integer> dw = new Stack<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        int car = 0;
        System.out.println(dw);
        int choice;
        do {


            System.out.println("What would you like to do ");
            System.out.println(" 0 - driveway is currently at" + dw + "Street stack is currently at " + st);
            System.out.println("1- add a car to the driveway");
            System.out.println(" 2 - remove a car from the driveway");

            choice = kbrd.nextInt();

            switch (choice) {
                case 0:{
                    System.out.println("Driveway = " + dw);
                    System.out.println("Street = " + st);
                }
                break;
                case 1: {
                    System.out.println("Please enter car Registration");
                    dw.push(kbrd.nextInt());
                    System.out.println("cars in driveway " + dw);
                }
                break;
                case 2: {
                    System.out.println("Please enter Registration set for removal");
                        int reg = kbrd.nextInt();
                    while (dw.peek() != reg) {
                        st.push(dw.pop());
                        System.out.println("Street stack is currently at " + st);
                    }  if (dw.peek() == reg) {
                        dw.pop();
                        while (!st.empty()){
                            dw.push(st.pop());
                        }
                    }
                }
            }
        } while (choice > 0);

//        dw.push(kbrd.nextInt());
//        System.out.println("cars in driveway "+ dw);
//        dw.push(kbrd.nextInt());
//        System.out.println("cars in driveway "+ dw);
//
//        System.out.println("cars moved to street "+ st);

    }

    public static void main(String[] args) {
        runSimulation();
    }
}