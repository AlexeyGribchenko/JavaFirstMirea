package ru.mirea.task17.employee;


public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public void setEmployeeExtraMoney(double extraMoney) {
        model.setExtraMoney(extraMoney);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public double getEmployeeExtraMoney() {
        return model.getExtraMoney();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary(), model.getExtraMoney());
    }
}
