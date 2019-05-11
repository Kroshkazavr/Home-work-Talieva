package ru.talieva.lesson09.task01;

import ru.talieva.lesson09.task02.Swimmable;

/**
 * Наследник класса Животное с реализованным методом getName
 **/
public class Fish extends Animal implements Swimmable {

    private Fish(String title) { // Конструктор
        super(title);
    }

    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo");
        nemo.getName();
        nemo.swim();
        nemo.getSleep();
    }

    @Override
    public void getName() { // Реализация абстрактного метода на название
        System.out.println("Буль-Буль! Я рыба. Меня зовут " + super.getTitle() + ".");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю лучше всех и живу в воде."); // Реализация интерфейса плавание
    }
}
