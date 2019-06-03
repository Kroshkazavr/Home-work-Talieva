package ru.talieva.lesson17;

import java.io.Serializable;

/**
 * Класс "Библиотека" с методами:
 * добавить книгу в библиотеку.
 * показать список книг в библиотеке.
 **/

public class Library implements Serializable {

    private static final long serialVersionUID = 5261834067719391888L;

    private Book[] bookStack = new Book[0]; // массив с объектами класса Книга (список книг в библиотеке)

    private Book[] getBookStack() {
        return bookStack;
    }

    public void setBookStack(Book[] bookStack) {
        this.bookStack = bookStack;
    }

    /**
     * метод для добавления книги в библиотеку
     *
     * @param book книга для добавления в библиотеку
     */
    void addBook(Book book) {
        Book[] newBooks = new Book[bookStack.length + 1];
        System.arraycopy(bookStack, 0, newBooks, 0, bookStack.length);
        newBooks[bookStack.length] = book;
        bookStack = newBooks;
    }

    /**
     * метод вывода массива книг с проверкой на пустоту
     */
    void listBooks() {
        if (this.getBookStack().length == 0) {
            System.out.println("Библиотека пуста.");
        } else {
            for (Book book : bookStack) {
                System.out.println(book);
            }
        }
    }
}
