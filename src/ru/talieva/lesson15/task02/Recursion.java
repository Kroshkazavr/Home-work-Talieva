package ru.talieva.lesson15.task02;

import java.io.File;
import java.io.IOException;

/**
 * Рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
 * До полнительное задание: программа следит за глубиной рекурсии,
 * сдвигая название файла/каталога на соответствующее количество пробелов.
 */

public class Recursion {
    private static int count = 0;

    static void main(String[] args) throws IOException {
        new File("dir/a/b").mkdirs();
        new File("dir/d.txt").createNewFile();
        new File("dir/e.txt").createNewFile();
        new File("dir/a/b/2.txt").createNewFile();
        new File("dir/a/b/3.txt").createNewFile();
        new File("dir/a/b/4.txt").createNewFile();
        System.out.println("*********************************");

        File dir = new File("dir");
        System.out.println("Структура каталога " + dir.getName() + ".");
        recursivePrint(dir);
        System.out.println("Вывод закончен.");
        System.out.println("*********************************");
    }

    public static void recursivePrint(File dir) {
        File[] files = dir.listFiles();
        System.out.println(dir.getName());
        if (files != null) {
            for (File file : files) {
                count++;
                if (file.isFile()) {
                    for (int i = 1; i <= count; i++) {
                        System.out.print(" ");
                    }
                    System.out.println(file.getName());
                    count--;
                } else {
                    for (int i = 1; i <= count; i++) {
                        System.out.print(" ");
                    }
                    recursivePrint(file);
                    count--;
                }
            }
        }
        else {
            System.out.println("Пустой каталог.");
        }
    }
}
