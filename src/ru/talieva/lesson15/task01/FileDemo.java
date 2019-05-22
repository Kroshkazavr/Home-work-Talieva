package ru.talieva.lesson15.task01;

import java.io.File;
import java.io.IOException;

import static ru.talieva.lesson15.task01.CopyFile.copyFile;
import static ru.talieva.lesson15.task01.RecursiveDelite.recursiveDelete;
import static ru.talieva.lesson15.task02.Recursion.recursivePrint;

/**
 * Примеры создания, переименовывания, копирования и удаления файлов
 **/

public class FileDemo {

    public static void main(String[] args) throws IOException {

        //Создаём каталоги и вложенные каталоги
        File dir = new File("Demo");
        new File("Demo/one/two").mkdirs();

        //Создаём файлы с помощью разных конструкторов и методов
        File test01 = new File(dir, "test01.txt");
        test01.createNewFile();
        File test02 = new File("Demo/one", "test02.txt");
        test02.createNewFile();
        new File("Demo/one/two/test03.txt").createNewFile();

        //Выводим список файлов в консоль
        System.out.println("=== список файлов в каталоге ===");
        recursivePrint(dir);

        //Переименовываем файлы и выводим список в консоль
        System.out.println("=== процедура переименования файлов ===");
        File test01_1 = new File("Demo/tEEEsT_01");
        test01.renameTo(test01_1);
        File test02_1 = new File("Demo/one/tEEEsT_02");
        test02.renameTo(test02_1);
        File test03 = new File("Demo/one/two/test03.txt");
        File test03_1 = new File("Demo/one/two/tEEEsT_03");
        test03.renameTo(test03_1);
        recursivePrint(dir);

        //Копируем файлы и каталоги и выводим список в консоль
        System.out.println("=== процедура копирования файлов ===");
        File copyFile1 = new File("Demo/copyTest1.txt");
        copyFile(test01_1, copyFile1);
        File copyFile2 = new File("Demo/one/copyTest2.txt");
        copyFile(test02_1, copyFile2);
        File copyFile3 = new File("Demo/one/two/copyTest3.txt");
        copyFile(test03_1, copyFile3);
        recursivePrint(dir);

        //Удаляем созданные файлы и каталоги
        System.out.println("=== удаление файлов и каталогов ===");
        recursiveDelete(dir);
    }
}

