package org.testing.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class BookJAXB {

    public void marshal() throws JAXBException {
        Book book = new Book();
        book.setId(2L);
        book.setName("Book2");
        book.setAuthor("Author2");
        book.setDate(new Date());

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, new File("./book.xml"));
    }

    public Book unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        return (Book) context.createUnmarshaller()
                .unmarshal(new FileReader("./book.xml"));
    }

}
