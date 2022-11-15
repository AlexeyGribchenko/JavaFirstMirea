package ru.mirea.task17.mvcstudentpattern;

public class MVCPatternDemo {

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Alexey");
        student.setRollNo("RollNo");
        return student;
    }

    public static void main(String[] args) {
        Student model  = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Grigory");
        System.out.println("\nAfter updating, Student details are as follows");
        controller.updateView();
    }
}
