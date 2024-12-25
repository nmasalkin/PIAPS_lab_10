package ru.vsu.cs.masalkin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Collection<Lecturer> lecturers = new LinkedList<>();
        Collection<Student> students = new LinkedList<>();
        Collection<Course> courses = new LinkedList<>();
        Collection<Institute> institutes = new LinkedList<>();
        Collection<Faculty> faculties = new LinkedList<>();
        Collection<AdminEmployee> adminEmployees = new LinkedList<>();

        Lecturer lecturer = new Lecturer(1, 10, "petrov@vsu.ru",
                "Петров П.П.", 4);
        lecturers.add(lecturer);

        Student student = new Student("Алексей Николаев");
        students.add(student);

        AdminEmployee adminEmployee = new AdminEmployee("Сидорова А.А.", 120000,
                "sidorova@vsu.ru", 5, 2);
        adminEmployees.add(adminEmployee);

        Project project = new Project("Курсовая работа по ООП",
                new Date(2024 - 1900, Calendar.DECEMBER, 25),
                new Date(2024 - 1900, Calendar.DECEMBER, 29));

        ResearchAssociate assistant = new ResearchAssociate("ФКН", "Кузнецов И.В.");

        Dean dean = new Dean("Иванова Е.В.", 250000,
                "ivanova@vsu.ru", 10, 5);

        Participation participation = new Participation(95.7);

        Course course = new Course("Программирование на Java", 40, 120);
        courses.add(course);

        Institute institute = new Institute("IoT - Институт информационных технологий", "Россия, г. Воронеж, Университетская пл., д. 1, ауд. 381а");
        institutes.add(institute);

        Faculty faculty = new Faculty(dean, institutes, "Факультет компьютерных наук (ФКН)");
        faculties.add(faculty);

        printData(lecturers, students, courses, faculties, institutes, adminEmployees, participation, assistant, project);
    }

    public static void printData(Collection<Lecturer> lecturers, Collection<Student> students, Collection<Course> courses,
                                 Collection<Faculty> faculties, Collection<Institute> institutes,
                                 Collection<AdminEmployee> adminEmployees, Participation participation,
                                 ResearchAssociate assistant, Project project) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("=== Преподаватели ===");
        lecturers.forEach(System.out::println);

        System.out.println("=== Студенты ===");
        students.forEach(System.out::println);

        System.out.println("=== Курсы ===");
        courses.forEach(System.out::println);

        System.out.println("=== Факультеты ===");
        faculties.forEach(System.out::println);

        System.out.println("=== Институты ===");
        institutes.forEach(System.out::println);

        System.out.println("=== Административные сотрудники ===");
        adminEmployees.forEach(System.out::println);

        System.out.println("=== Участие ===");
        System.out.println(participation);

        System.out.println("=== Научный сотрудник ===");
        System.out.println(assistant);

        System.out.println("=== Проект ===");
        System.out.printf("Название: %s, Дата начала: %s, Дата окончания: %s",
                project.getName(),
                dateFormat.format(project.getStart()),
                dateFormat.format(project.getEnd()));
    }
}
