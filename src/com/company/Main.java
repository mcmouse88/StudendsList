package com.company;

import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Student> studentsList = new HashSet<>();
        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(", ");
            try {
                if (!studentsList.add(new Student(parts[0], parts[1], Integer.parseInt(parts[2])))) {
                    System.out.println("Проверьте правильность ввода студенческого билета, такой билет уже существует");
                }
            } catch (RuntimeException e) {
                System.out.println("Неправильный формат ввода");
                System.out.println("Введите данные в формате \"Иванов Петр Николаевич, 1243-Б, 31231343\"");
            }
        }
        for (Student targetStudent : studentsList) {
            System.out.println(targetStudent);
        }
    }
}
