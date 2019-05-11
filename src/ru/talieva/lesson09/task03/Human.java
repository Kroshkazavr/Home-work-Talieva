package ru.talieva.lesson09.task03;

import ru.talieva.lesson09.task02.Swimmable;
import ru.talieva.lesson09.task02.Runnable;

/**
 * Родительский класс Человек имплементируюший интерфейсы Плавать и Бегать
 **/
public abstract class Human implements Runnable, Swimmable {
    private int age; // возраст
    private String name; // имя

    Human(int age, String name) { // конструктор
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run(); // абстрактный метод из интерфейса бегать для дальнейшей реализации в потомках

    public abstract void swim(); // абстрактный метод из интерфейса плавать для дальнейшей реализации в потомках

    public abstract void dive(); // абстрактный метод из интерфейса плавать для дальнейшей реализации в потомках
}
