package printer;

import java.util.List;

import model.*;

public class DetailsPrinter
{
    private List<Employee> employees;

    public DetailsPrinter(List<Employee> employees)
    {
        this.employees = employees;
    }

    public void printDetails()
    {
    	int i = 1;
        for(Employee employee : employees)
        {
            System.out.println("Employee " + i + ": " + employee + "\n");
            i++;
        }
    }
}
