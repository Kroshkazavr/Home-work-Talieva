package ru.talieva.lesson15.task01;

import java.io.*;

/**
 * Копирование файла с использованием потоков
 */

class CopyFile {

    static void copyFile(File source, File dest) throws IOException {
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }
}
