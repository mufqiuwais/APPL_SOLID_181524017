package model;

public class Employee {
	
	private String Name;
	
	public Employee(String name)
    {
        this.setName(name);
    }

	@Override
    public String toString()
    {
        return this.getName();
    }
    
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
}
