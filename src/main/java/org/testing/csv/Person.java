package org.testing.csv;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Person {
    public void writeCSVFile () {
        try {
            // create scanner instance
            Scanner scanner = new Scanner(Paths.get("users-hid.csv").toFile());

            // set comma as delimiter
            scanner.useDelimiter(",");

            // read all fields
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }

            //close the scanner
            scanner.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void readCSVFile () {
        try {
            // create a list of objects
            List<List<String>> records = Arrays.asList(
                    Arrays.asList("1", "John Lee", "US"),
                    Arrays.asList("2", "Jovan Roover", "DE"),
                    Arrays.asList("3", "Emma Watson", "UK")
            );

            // create a writer
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("users-hid.csv"));

            // write header record
            writer.write("ID,Name,Country");
            writer.newLine();

            // write all records
            for (List<String> record : records) {
                writer.write(String.join(",", record));
                writer.newLine();
            }

            //close the writer
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
