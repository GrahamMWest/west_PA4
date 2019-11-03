import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class DuplicateCounter {

    // Global variables to prevent having to pass them through the methods
    private int wordCounter = 0;
    private ArrayList<String> wordList = new ArrayList<String>();
    private HashMap<String, Integer> duplicateWords = new HashMap<String, Integer>();

    public void count(Scanner dataFile) throws Exception {
        String temp;
        int i, j;

        // Takes the input from the file and adds it to the ArrayList
        while(dataFile.hasNext()) {
            wordList.add(dataFile.next());
        }

        // For loops that takes the first word and compares it to all the other words
        for (i = 0; i < wordList.size(); i++) {

            temp = wordList.get(i);

            for (j = 0; j < wordList.size(); j++) {

                if (temp.equals(wordList.get(j))) {
                        wordCounter++;
                }

                // Adds the name with its word count to the HashMap
                duplicateWords.put(temp, wordCounter);
            }

            wordCounter = 0;
        }

        // Closes the file
        dataFile.close();
    }

    public void write(File outputFile) throws Exception {

        // Creates a new file writer to write the array to a file called "unique_word_counts.txt"
        FileWriter writer = new FileWriter(outputFile);

        // Takes the unique words and their count and outputs them to "unique_word_counts.txt"
        writer.write("Words: \n" + duplicateWords.keySet() + "\n\nTheir occurrences: \n" + duplicateWords.values());

        // Closes the writer method
        writer.close();
    }
}
