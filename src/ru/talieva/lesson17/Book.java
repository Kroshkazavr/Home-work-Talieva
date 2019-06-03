package ru.talieva.lesson17;

import java.io.Serializable;

/**
 * Класс "Книга". Каждая книга имеет название, автора, год издания.
 **/

public class Book implements Serializable {

    private static final long serialVersionUID = -37554869499993212L;
    private String title; // Название произведения
    private String author; // Автор книги
    private int year; //год выауска

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return строка с данными о книге
     */
    @Override
    public String toString() {
        return "Book [" +
                "Название: " + title +
                "; автор: " + author +
                "; год издания: " + year +
                ']';
    }
}
