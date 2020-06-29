package model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee
{
	private List<String> Documents;
    public Manager(String name, List<String> documents)
    {
    	super(name);
        this.setDocuments(new ArrayList<String>(documents));
    }

    @Override
    public String toString()
    {
    	String result;
    	result = super.toString() + "\n" + "Documents : " + 
    			String.join(", ", getDocuments());
        return result;
    }

	public List<String> getDocuments() {
		return Documents;
	}

	public void setDocuments(List<String> documents) {
		Documents = documents;
	}
}
