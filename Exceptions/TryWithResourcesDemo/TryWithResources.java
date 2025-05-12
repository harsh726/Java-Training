package Exceptions.TryWithResourcesDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        File input = new File("E:\\Java-Training\\Exceptions\\TryWithResourcesDemo\\input.txt");
        File output = new File("E:\\Java-Training\\Exceptions\\TryWithResourcesDemo\\output.txt");
        try (
            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());  // Writing uppercase version of each line
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
