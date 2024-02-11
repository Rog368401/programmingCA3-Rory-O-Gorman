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
        Stack<Pair> stack = new Stack<>();
        int count = 1;

        stack.push(new Pair(r, c));

        while (!stack.isEmpty()) {
            Pair currentPair = stack.pop();
            int row = currentPair.row;
            int col = currentPair.column;

            if (arr[row][col] == 0) {
                arr[row][col] = count++;
                pushUnfilledNeighbors(stack, row, col, arr);
            }
        }
    }

    private static void pushUnfilledNeighbors(Stack<Pair> stack, int row, int col, int[][] arr) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (isValid(newRow, newCol) && arr[newRow][newCol] == 0) {
                stack.push(new Pair(newRow, newCol));
            }
        }
    }

    private static boolean isValid(int row, int col) {
        return row >= 0 && row < 10 && col >= 0 && col < 10;
    }

    public static void start()
    {
       int[][] arr = floodFillStart();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting row: ");
        int startRow = scanner.nextInt();
        System.out.print("Enter starting column: ");
        int startCol = scanner.nextInt();

        fill(startRow, startCol, arr);
        display(arr);
    }
    public static void main(String[] args) {
        start();
    }

}
