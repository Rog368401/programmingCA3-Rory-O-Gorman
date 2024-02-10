package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *  Name:
 *  Class Group:
 */

public class CA3_Question3
{
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        scan.useDelimiter("[^A-Za-z0-9_]+");

        Map<String, List<Integer>> identifierMap = new HashMap<>();

        int lineNumber = 0;
        while (scan.hasNextLine()) {
            lineNumber++;
            String line = scan.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String identifier = lineScanner.next();
                List<Integer> lines = identifierMap.getOrDefault(identifier, new ArrayList<>());
                lines.add(lineNumber);
                identifierMap.put(identifier, lines);
            }
        }

        for (Map.Entry<String, List<Integer>> entry : identifierMap.entrySet()) {
            System.out.println("Identifier: " + entry.getKey());
            System.out.println("Lines: " + entry.getValue());
            System.out.println();
        }

        scan.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile("src/CA3_Question1.java");
    }
}