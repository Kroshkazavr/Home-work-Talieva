package ru.talieva.lesson15.task01;

import java.io.File;
import java.util.Objects;

/**
 * Рекурсивный удаление всех файлов и подкаталогов внутри заданного каталога.
 */

class RecursiveDelite {

    static void recursiveDelete(File dir) {
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            if (file.isFile()) {
                file.delete();
                System.out.println("файл <" + file + "> удален");
            } else {
                recursiveDelete(file);
            }
        }
        dir.delete();
        System.out.println("каталог <" + dir + "> удален");
    }
}
