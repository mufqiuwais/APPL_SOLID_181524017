package model;

import workerInterface.ISleeper;

public class Employee extends Worker implements ISleeper
{
    public Employee(String id)
    {
    	super(id);
    }

	@Override
	public void sleep() {
		System.out.println("Employee " + super.getId() + " is sleeping...");
	}
}
