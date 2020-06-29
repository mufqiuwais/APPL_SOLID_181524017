package model;

import workerInterface.IRechargeable;

public class Robot extends Worker implements IRechargeable{

	private int capacity;
    private int currentPower;

    public Robot(String id, int capacity)
    {
    	super(id);
    	this.capacity = capacity;
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    public int getCurrentPower()
    {
        return this.currentPower;
    }
    
    public void setCurrentPower(int value)
    {
    	this.currentPower = value;
    }

    @Override
    public void Work(int hours)
    {
        if (hours > this.currentPower)
        {
            hours = currentPower;
        }

        super.Work(hours);
        this.currentPower -= hours;
    }

    @Override
    public void Recharge()
    {
    	System.out.println("Robot " + super.getId() + " is recharging...");
        this.currentPower = this.capacity;
    }

}
