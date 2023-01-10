package org.testing.gson;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String title;
    private String isbn;
    private long year;
    private String[] authors;

    public Book() {
    }

    public Book(String title, String isbn, long year, String[] authors) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public long getYear() {
        return year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && isbn.equals(book.isbn) && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, isbn, year);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
