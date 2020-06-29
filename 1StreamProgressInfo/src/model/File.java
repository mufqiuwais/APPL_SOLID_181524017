package model;

import streamableInterface.IStreamable;

public class File implements IStreamable{
	
	private int length;
	private int bytesSent;
	private String name;
   
    public File(String name, int length, int bytesSent)
    {
        this.name = name;
        this.length = length;
        this.bytesSent = bytesSent;
    }

	@Override
	public int getLength() {
		return this.length;
	}

	@Override
	public int getBytesSent() {
		return this.bytesSent;
	}
}
