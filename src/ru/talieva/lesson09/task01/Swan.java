package ru.talieva.lesson09.task01;

import ru.talieva.lesson09.task02.Flyable;
import ru.talieva.lesson09.task02.Swimmable;

/**
 * Наследник класса Животное с реализованным методом getName
 **/
public class Swan extends Animal implements ru.talieva.lesson09.task02.Runnable, Flyable, Swimmable {

    private Swan(String title) { // Конструктор
        super(title);
    }

    public static void main(String[] args) {
        Swan swan = new Swan("Oscar");
        swan.getName();
        swan.run();
        swan.fly();
        swan.getSleep();
    }

    @Override
    public void getName() { // Реализация абстрактного метода на название
        System.out.println("Га-га-га! Я лебедь. Меня зовут " + super.getTitle() + ".");
    }

    @Override
    public void run() { // Реализация интерфейса бег
        System.out.println("Я умею небыстро бегать.");

    }

    @Override
    public void fly() { // Реализация интерфейса полет
        System.out.println("Я прекрасно летаю! С максимальной скоростью 90 км/ч.");
    }

    @Override
    public void swim() { // Реализация интерфейса плавание
        System.out.println("Я отлично плаваю.");
    }
}
