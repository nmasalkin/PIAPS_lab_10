package ru.vsu.cs.masalkin;

public class Student {

    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void executeTask() {
    }

    @Override
    public String toString() {
        return "src.Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }
}