package ru.talieva.lesson08.Task03;

/**
 * Класс акт
 **/
class ServiceTicket {
    String[] list; // список услуг
    private int number; // номер договора
    private String startDate; // дата начала договора
    private String endDate; // дата окончания договора

    ServiceTicket(int number, String startDate, String endDate, String[] list) { // Конструктор акта
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.list = list;
    }

    void getListPrint(String[] list) { //Метод печати массива услуг
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    String getEndDate() {

        return endDate;
    }

    String getStartDate() {

        return startDate;
    }

    int getNumber() {

        return number;
    }

    String[] getList() {
        return list;
    }
}

