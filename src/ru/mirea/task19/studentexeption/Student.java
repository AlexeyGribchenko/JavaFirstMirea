package ru.mirea.task19.studentexeption;


public class Student implements Comparable<Student>{
    private String name;
    private int gpa, group, age;

    public Student(String name, int gpa, int group, int age) {
        this.name = name;
        this.gpa = gpa;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setFio(String name) {
        if(name.equals(""))
            throw new EmptyStringException();
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Имя = '" + name + '\'' +
                ", Баллы = " + gpa +
                ", Группа=" + group +
                ", Возраст = " + age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}