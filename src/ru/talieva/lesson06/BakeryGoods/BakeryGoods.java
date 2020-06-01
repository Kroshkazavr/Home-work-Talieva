package ru.talieva.lesson06.BakeryGoods;

/**
 * Родительский класс выпечка
 **/
public abstract class BakeryGoods {
    private int freshness; //свежесть выпечки в днях
    private int dueDay; //срок годности в днях
    private double weight; //вес в килограммах
    private String title; // название

    BakeryGoods(int freshness, int dueDay, double weight) {
        this.freshness = freshness;
        this.dueDay = dueDay;
        this.weight = weight;
    }

    public void getDryUp(int freshness, int dueDay) { //метод вычисляющий, не засохла ли выпечка
        if (freshness > dueDay) {
            System.out.println("Я засох.");
        } else System.out.println("Я свеж.");
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getDueDay() {
        return dueDay;
    }

    public void setDueDay(int dueDay) {
        this.dueDay = dueDay;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
