package org.testing.jacksonJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;

public class BookJSON {
    public void writeJsonFile() {
        try {
            // create book object
            Book book = new Book("Thinking in Java", "978-0131872486", 1998,
                    new String[]{"Bruce Eckel"});

            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert book object to JSON file
            mapper.writeValue(Paths.get("book.json").toFile(), book);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readJsonFile () {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert a JSON string to a Book object
            Book book = mapper.readValue(Paths.get("book.json").toFile(), Book.class);

            // print book
            System.out.println(book);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
