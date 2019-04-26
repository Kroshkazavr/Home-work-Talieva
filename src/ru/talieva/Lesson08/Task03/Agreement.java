package ru.talieva.Lesson08.Task03;

/** Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).**/
//todo поправь док
public class Agreement {
    private int number; // номер договора
    private String startDate; // дата начала договора
    private String endDate; // дата окончания договора
    private String[] list; // список услуг

    Agreement (int number, String startDate, String endDate){
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getList(String[] list, int i) {
        if (i < list.length){
            String str = list[i];
            return str;
        }
        else return "Ошибка индексов";
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
//    public class Lesson8 {
//        private String title;
//
//        public Lesson8(String title) {
//            this.title = title;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//    }
}
