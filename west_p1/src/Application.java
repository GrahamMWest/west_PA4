import java.io.*;
import java.util.Scanner;


// Application class takes in an input file, removes the duplicate words, then outputs them to a new file
public class Application {

    public static void main(String[] args) throws IOException {

        // Creates a new object for Duplicate Remover
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        // Initializes variables for new file input for problem1.txt
        FileInputStream fileByteStream = null;
        Scanner dataFile = null;
        FileOutputStream output = null;

        // Creates for new file input for "problem1.txt"
        fileByteStream = new FileInputStream("problem1.txt");
        dataFile = new Scanner(fileByteStream);

        // Creates for new file output for "unique_words.txt"
        File outputFile = new File("unique_words.txt");

        // Calls the methods from the Duplicate remover object
        duplicateRemover.remove(dataFile);
        duplicateRemover.write(outputFile);
    }
}
