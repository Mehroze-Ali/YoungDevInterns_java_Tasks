package week4_fileio;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // Writing to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello World!\n");
            writer.write("This is a sample text file.\n");
            writer.write("It has multiple lines and words.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from file & counting words/lines
        int lineCount = 0, wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}