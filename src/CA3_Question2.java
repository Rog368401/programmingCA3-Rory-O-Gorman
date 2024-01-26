package src;
import java.util.Scanner;
import java.util.Stack;

/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question2
{
    /*
        Starter function to create the 2D array and populate it with 0

     */
    public static int[][]  floodFillStart() {
        Scanner kb = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                arr[x][y] = 0;
            }
        }
       return arr;
    }
    /*
        Helper function to display the image
     */
    public static void display(int[][] arr)
    {
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                System.out.printf("%4d", arr[x][y]);
            }
            System.out.println();
        }
    }
    private static void fill(int r, int c, int[][] arr)
    {
        Scanner kb = new Scanner(System.in);
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(r,c));
        System.out.println("Please enter starting position");
        int startRow = kb.nextInt();
        int startColumn = kb.nextInt();
        while(!stack.isEmpty())
        {
            Pair currentPair = stack.pop();
        }

    }

    public static void start()
    {
       int[][] arr = floodFillStart();
    }
    public static void main(String[] args) {
        start();
    }

}
