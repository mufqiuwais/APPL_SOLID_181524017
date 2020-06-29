package model;

import streamableInterface.IStreamable;

public class Movie implements IStreamable{
	
	private int length;
	private int bytesSent;
	private String title;
    private int year;
   
    public Movie(String title, int year, int length, int bytesSent)
    {
        this.title = title;
        this.year = year;
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
