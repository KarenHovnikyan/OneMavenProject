package org.testing.jaxb;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "date" })
public class Book {
    private Long id;
    private String name;
    private String author;
    private Date date;

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }
    @XmlElement(name = "title")
    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public void setAuthor(String author) {
        this.author = author;
    }
    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public Book() {
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }
}