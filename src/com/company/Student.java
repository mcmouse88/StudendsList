package com.company;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private final int studentId;

    public Student(String name, String group, int studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Student.class)) return false;

        Student altStudent = (Student) obj;
        return studentId == altStudent.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", name, group, studentId);
    }
}
