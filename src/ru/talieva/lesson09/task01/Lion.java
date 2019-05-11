package ru.talieva.lesson09.task01;

import ru.talieva.lesson09.task02.Swimmable;

/**
 * Наследник класса Животное с реализованным методом getName
 **/
public class Lion extends Animal implements ru.talieva.lesson09.task02.Runnable, Swimmable {

    private Lion(String title) { // Конструктор
        super(title);
    }

    public static void main(String[] args) {
        Lion leo = new Lion("Leo");
        leo.getName();
        leo.run();
        leo.swim();
        leo.getSleep();
    }

    @Override
    public void getName() { // Реализация абстрактного метода на название
        System.out.println("А-р-р-р-р-р! Я лев. Меня зовут " + super.getTitle() + ".");
    }

    @Override
    public void run() { // Реализация интерфейса бег
        System.out.println("Я умею быстро бегать! Моя максимальная скоросить 80 км/ч.");
    }

    @Override
    public void swim() { // Реализация интерфейса плавание
        System.out.println("Я умею плавать.");
    }
}
