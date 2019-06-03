package ru.talieva.lesson17;

import java.io.*;

/**
 * Программа загружает содержимое "библиотеки" при запуске из файла.
 * В случае отсутствия файла на диске, создает файл.
 * Перед закрытием сохраняет состояние библиотеки в файл.
 * Показывает соответствующее сообщения в случае ошибок.
 * !!!потоки закрываются
 **/

public class App {

    public static void main(String[] args) {
        File filename = new File("lib.txt"); // имя файла для хранения библиотеки
        Library library = null; // библиотека
        try {
            if (!filename.exists()) {
                filename.createNewFile(); // создаем файл, если его еще нет
                library = new Library(); // создаем новую библиотеку
            } else {
                library = loadLibrary(filename); // если файл уже есть, то считываем библиотеку
            }
        } catch (IOException e) {
            System.out.println("Внимание! Ошибка файла.");
        }

        System.out.println("Сейчас в библиотеке есть (список загружен из файла):");

        library.listBooks();

        // блок добавления новых книг
        Book book1 = new Book("Алгоритмы. Руководство по разработке", "Стивен Скиена", 2019);
        library.addBook(book1);
        Book book2 = new Book("Сон королевы корней", "Барбара Базальдуа", 2016);
        library.addBook(book2);
        Book book3 = new Book("Гарри Поттер и тайная комната", "Дж.К. Роулинг", 2006);
        library.addBook(book3);
        saveLibrary(library, filename);
        System.out.println("После добавления новых книг в библиотеке есть:");
        library.listBooks();

    }

    /**
     * метод для десериализации библиотеки (чтение их файла)
     *
     * @param fileName имя файла
     * @return возвращает считанную библиотеку
     */
    private static Library loadLibrary(File fileName) {
        Library library = new Library();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            library = (Library) ois.readObject();
        } catch (IOException ex) {
            System.out.println("Внимание! Ошибка ввода-вывода.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Внимание! Ошибка класса.");
        }
        return library;
    }

    /**
     * метод для сохранения библиотеки в файл
     *
     * @param library  библиотека для сериализации
     * @param fileName файл для сохранения
     */
    private static void saveLibrary(Library library, File fileName) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(library);
            out.close();
        } catch (IOException ex) {
            System.out.println("Внимание! Ошибка файла.");
        }
    }
}
