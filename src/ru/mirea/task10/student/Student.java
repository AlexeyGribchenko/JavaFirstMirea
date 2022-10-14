package ru.mirea.task10.student;

public class Student {
    private String name;
    private String surname;
    private int course;
    private int group;

    private String specialty;

    public Student(String name, String surname,  String specialty, int course, int group) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String toString() {
        return name + " " + surname + " " + course + " " + group + " " + specialty;
    }
}