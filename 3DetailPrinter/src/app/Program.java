package app;

import java.util.ArrayList;

import model.*;
import printer.*;

public class Program
{
	public static void main(String args[])
    {
        Employee employee1 = new Employee("Abdul");
        Employee employee2 = new Employee("Zaki");
        ArrayList<String> documents = new ArrayList<String>();
        documents.add("Report Files");
        documents.add("CV");
        Manager manager = new Manager("Anwar", documents);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(manager);

        DetailsPrinter printer = new DetailsPrinter(employees);
        printer.printDetails();
    }
}
