package ru.talieva.lesson09.task01;

/**
 * Родительский абстрактный класс Животное с абстрактным методом getName
 **/
public abstract class Animal {
    private String title; // Название животного

    Animal(String title) {
        this.title = title;
    }

    void getSleep() {
        System.out.println("Споконой ночи! Я уснул."); // Метод сна для всех животных
    }

    String getTitle() { // Геттер на название
        return title;
    }

    public void setTitle(String title) { // Сеттер на название
        this.title = title;
    }

    public abstract void getName(); // Абстрактный метод на название
}
