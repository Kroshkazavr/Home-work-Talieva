package ru.talieva.lesson18;

import java.io.*;

/**
 * Программа, которая копирует файл с одной кодировкой в файл с другой.
 **/
public class EnCoder {

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в тест Reader/Writer и кодировок.");
        File test01 = new File("01.txt");
        File test02 = new File("02.txt");
        String charset1 = "KOI8";
        String charset2 = "Windows-1251";

        //Создаём файлы для копирования и записи
        try {
            System.out.println(">Создаем первый файл: " + test01.createNewFile());
            System.out.println(">Создаем второй файл: " + test02.createNewFile());
        } catch (IOException e) {
            System.out.println("Ощибка при создании файла.");
        }

        //Записываем в файл для копирования с нужной кодировкой
        try (OutputStream os = new FileOutputStream(test01)) {
            String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut \n" +
                    "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \n" +
                    "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit\n" +
                    " esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, \n" +
                    "sunt in culpa qui officia deserunt mollit anim id est laborum.";
            os.write(s.getBytes(charset1));
        } catch (IOException e) {
            System.out.println("Ощибка при записи в файл с использованием установки кодировки.");
        }
        System.out.println(">Записали кое-что в первый файл.");

        //Считываем из файла для копирования
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(test01), 5)) {

                //Записываем в новый файл с другой кодировкой
                String s;
                OutputStream os = new FileOutputStream(test02);
                //for (int i = 0; i <= countFileLines(test01); ) {
                    while ((s = br.readLine()) != null) {
                        //if (i > 1 || i < countFileLines(test01)) {
                        String s1 = s + " \n";
                        os.write(s1.getBytes(charset2));
                        //i++;
                        // } else {
                        // os.write(s.getBytes(charset2));
                        //i++;
                        //}
                    }
                //}
            }
        } catch (IOException e) {
            System.out.println("Файл для чтения не найден или не прочитан. Или во время записи что-то пощло не так.");
        }
        System.out.println(">Скопировали все из первого во второй файл.");

        // Вывод содержимого файлов в консоль для сравнения.
        System.out.println(">Содержимое первого файла с кодировкой " + charset1);
        readFile(test01, charset1);
        System.out.println(">Содержимое второго файла с кодировкой " + charset2);
        readFile(test02, charset1);
    }

    /**
     * метод для вывода содержимого файла а консоль
     *
     * @param test     файл для чтения
     * @param charset1 кодировка файла
     */
    private static void readFile(File test, String charset1) {
        System.out.println("*********************************************************");
        try (Reader reader = new InputStreamReader(new FileInputStream(test), charset1)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Файл для чтения не найден или не прочитан.");
        }
        System.out.println(" ");
        System.out.println("*********************************************************");
    }

    /**
     * метод для подсчета переносов строки в файле
     *
     * @param test файл для подсчета переносов строки
     * @return количество \n в файле
     */
    private static int countFileLines(File test) {

        int counterN = 0;
        try (InputStream is = new BufferedInputStream(new FileInputStream(test))) {
            byte[] c = new byte[1024];
            int readChars = is.read(c);
            if (readChars == -1) { // если файл пустой
                return 0;
            }
            while (readChars == 1024) {
                for (int i = 0; i < 1024; ) {
                    if (c[i++] == '\n') {
                        counterN++;
                    }
                }
                readChars = is.read(c);
            }
            while (readChars != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        counterN++;
                    }
                }
                readChars = is.read(c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при подсчете строк");
        }
        return counterN;
    }
}

