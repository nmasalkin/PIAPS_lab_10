package ru.vsu.cs.masalkin;

public class Course {

    public String name;

    public float hours;

    public int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHours() {
        return this.hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course(String name, double hours, int id) {
        // TODO - implement src.Course.src.Course
    }

    public void cancelLesson() {
        // TODO - implement src.Course.cancelLesson
    }

    @Override
    public String toString() {
        return "src.Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", id=" + id +
                '}';
    }
}