import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *  Name: Rory O'Gorman
 *  Class Group: SD2B
 */
public class CA3_Question1
{
    public static void runSimulation()
    {
driveway();
street();
    }
public void driveway()
{
    Scanner kbrd = new Scanner(System.in);
    Stack<Integer> dw = new Stack<Integer>();
    dw.push(kbrd.nextInt());
    dw.push(kbrd.nextInt());
    System.out.println("Current Stack is "+ dw);
}
public void street()
{

}
    public static void main(String[] args) {
        runSimulation();
    }
}
