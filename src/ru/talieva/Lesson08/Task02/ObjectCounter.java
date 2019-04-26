package ru.talieva.Lesson08.Task02;

import java.util.Scanner;
/** Класс со счетчиком создания объектов и методом для получения данных счетчика.
 * БЕСКОНЕЧНЫЙ ЦИКЛ для проверки работы**/
public class ObjectCounter {
    private static int numberOfObject = 0; //статический счетчик объектов

    private static int getNumberOfObject() { //метод, возвращаюший кол-во созданных объектов
        return numberOfObject;
    }
    private static void createNewObject() { //метод увеличивает счетчик +1
        numberOfObject++;
    }
    public ObjectCounter() { //конструктор, который вызывает метод увеличения счетчика при создании нового объекта
        ObjectCounter.createNewObject();
    }
    public static void main( String [] args) {
        int quantity;
        while (true){
            System .out.println( "Сколько объектов нужно создать?");
            Scanner in = new Scanner (System.in); /*инициализация сканера*/
            quantity = in.nextInt();
            for ( int i = 0; i < quantity; i++) {
                new ObjectCounter();
            }
            System .out.println( "Теперь создано " + getNumberOfObject() + " объектов." );
        }
    }
}

