package ru.talieva.Lesson08.Task03;

public class ServiceTicket {
    private int number; // номер договора
    private String startDate; // дата начала договора
    private String endDate; // дата окончания договора
    private String[] list; // список услуг

    ServiceTicket (int number, String startDate, String endDate, String[] list){
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.list = list;
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

//    public class Part2Lesson8 {
//        public static void main(String[] args) {
//            Lesson8 l8 = new Lesson8("Занятие 8");
//            System.out.println(Converter.convert(l8));
//        }
//    }
}
