package ru.talieva.lesson22;

import java.util.Comparator;

/**
 * ����� PersonSuperComparator,
 * ������� ����������� Comparator, �� ����� ���������� �� ���� ����������, ������� � ���.
 **/

public class PersonSuperComparator implements Comparator<Person> {

    /**
     * ����� ��� ��������� ��������� ������ Person
     * ������� �� �����, ����� �� ��������, ���� ����� ����������
     *
     * @return ��������� ���������
     */
    @Override
    public int compare(Person a, Person b) {
        if (a.getName().compareTo(b.getName()) != 0) { // ���� ����� �� �����,
            return a.getName().compareTo(b.getName()); // �� ���������� �� �����
        } else return a.getAge() - b.getAge(); // ����� ���������� �� ��������
    }
}

