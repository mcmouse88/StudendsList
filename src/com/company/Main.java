package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Student> studentsList = new HashMap<>();
        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(", ");
            try {
                if (!studentsList.containsKey(Integer.parseInt(parts[2]))) {
                    studentsList.put(Integer.parseInt(parts[2]), new Student(parts[0], parts[1], Integer.parseInt(parts[2])));
                } else {
                    System.out.println("Проверьте правильность ввода студенческого билета, такой билет уже существует");
                }
            } catch (RuntimeException e) {
                System.out.println("Неправильный формат ввода");
                System.out.println("Введите данные в формате \"Иванов Петр Николаевич, 1243-Б, 31231343\"");
            }
        }
        for (Student student : studentsList.values()) {
            System.out.println(student);
        }
    }
}
