package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }
    @Test
    public void displayEmployee()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 255530;
        emp.first_name = "Ronghao";
        emp.last_name = "Garigliano";
        emp.title = "Leader";
        emp.salary = 57499;
        //emp.dept = "Development";
       // emp.manager = "LeonDasSarma";
        employees.add(emp);
        app.displayEmployee(emp);
    }
    @Test
    public void printSalariesByDepartment()
    {
    ArrayList<Employee> employeesDep = new ArrayList<Employee>();
    Employee emp = new Employee();
    emp.emp_no = 10002;
    emp.first_name = "Bezalel";
    emp.last_name = "Simmel";
    emp.salary = 72527;
    employeesDep.add(emp);
}
}