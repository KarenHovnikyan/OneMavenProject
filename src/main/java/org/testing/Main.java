package org.testing;

import org.testing.jaxb.BookJAXB;
import javax.xml.bind.JAXBException;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws JAXBException, IOException {

        BookJAXB bookJAXB = new BookJAXB();
        bookJAXB.marshal();
        System.out.println(bookJAXB.unmarshall().toString());
    }
}