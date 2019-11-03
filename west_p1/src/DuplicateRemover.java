import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.HashSet;
import java.io.IOException;

public class DuplicateRemover {

    // Global variables to prevent having to pass them through the methods
    private HashSet<String> removeWords = new HashSet<String>();
    private String[] uniqueWords;

    public void remove(Scanner dataFile) throws IOException {

        // Takes the words from the data file and inputs them into the HashSet
        while (dataFile.hasNext()) {

            removeWords.add(dataFile.next());
         }

        // Initializes the array and adds the contents of the HashSet into the array
        uniqueWords = new String[removeWords.size()];
        removeWords.toArray(uniqueWords);

        // Closes the file
        dataFile.close();
    }

    public void write(File outputFile) throws IOException {

        // Creates a new file writer to write the array to a file called "unique_words.txt"
        FileWriter writer = new FileWriter(outputFile);

        // Takes the unique words and outputs them to the "unique_words.txt" file
        for (int i = 0; i < removeWords.size(); i++) {

            writer.write(uniqueWords[i] + " ");
        }

        // Closes the writer method
        writer.close();
    }
}
