package org.testing.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BookJSON {
    public void writeJsonFile() {
        try {
            // create book object
            Book book = new Book("Thinking in Java",
                                 "978-0131872486",
                                 1998,
                                  new String[]{"Bruce Eckel"});

            // create Gson instance
            Gson gson = new Gson();

            // create a writer
            Writer writer = Files.newBufferedWriter(Paths.get("book.json"));

            // convert book object to JSON file
            gson.toJson(book, writer);

            // close writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readJsonFile () {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("book.json"));

            // convert a JSON string to a Book object
            Book book = gson.fromJson(reader, Book.class);

            // print book
            System.out.println(book);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
