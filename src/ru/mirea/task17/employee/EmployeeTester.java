package ru.mirea.task17.employee;

import ru.mirea.task17.mvcstudentpattern.Student;
import ru.mirea.task17.mvcstudentpattern.StudentController;
import ru.mirea.task17.mvcstudentpattern.StudentView;

public class EmployeeTester {

    private static Employee retrieveEmployeeDataFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Vladislav");
        employee.setSalary(300000);
        employee.setExtraMoney(0);
        return employee;
    }

    public static void main(String[] args) {
        Employee model  = retrieveEmployeeDataFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeExtraMoney(23000);
        System.out.println("\nAfter updating, Student details are as follows");
        controller.updateView();
    }
}
