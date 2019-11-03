import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        // Initializes variables for new file input for problem1.txt
        FileInputStream fileByteStream = null;
        Scanner dataFile = null;
        FileOutputStream output = null;

        // Creates for new file input for "problem1.txt"
        fileByteStream = new FileInputStream("problem2.txt");
        dataFile = new Scanner(fileByteStream);

        // Creates for new file output for "unique_words.txt"
        File outputFile = new File("unique_word_counts.txt");

        // Calls the methods from the Duplicate remover object
        duplicateCounter.count(dataFile);
        duplicateCounter.write(outputFile);
    }
}
