package ru.talieva.lesson09.task03;

/**
 * Школьник - наследник класса Человек с конкретной реализацией абстрактных методов
 **/
public class Schoolboy extends Human {
    private int classGrade; // номер класса

    private Schoolboy(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        Schoolboy alan = new Schoolboy(11, "Alan");
        alan.setClassGrade(4);
        System.out.println("Я " + alan.getName() + ". Мне " + alan.getAge() + ".");
        System.out.println("Я учусь в " + alan.getClassGrade() + " классе.");
        alan.run();
        alan.swim();
        alan.dive();
    }

    private int getClassGrade() {
        return classGrade;
    }

    private void setClassGrade(int classGrade) {
        this.classGrade = classGrade;
    }

    @Override
    public void run() {
        System.out.println("Я бегаю на физкультуре и с друзьями.");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю для удовольствия.");
    }

    @Override
    public void dive() {
        System.out.println("Я боюсь нырять.");
    }
}
