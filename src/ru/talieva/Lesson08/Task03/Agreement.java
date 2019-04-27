package ru.talieva.Lesson08.Task03;

/** Класс договор**/
class Agreement {
    private int number; // номер договора
    private String startDate; // дата начала договора
    private String endDate; // дата окончания договора
    String[] list; // список услуг

    Agreement(int number, String startDate, String endDate) { //Конструктор договора
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    String[] getList() {
        return list;
    }

    void getListPrint(String[] list) { //Метод печати массива услуг
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    void setList(String[] list) {
        this.list = list;
    }

    String getEndDate() {
        return endDate;
    }

    void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    String getStartDate() {
        return startDate;
    }

    void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }
}
