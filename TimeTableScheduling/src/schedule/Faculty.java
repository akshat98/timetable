package schedule;

import java.sql.SQLException;
import java.util.*;
import database.FacultyDB;

public class Faculty {
	private String name;
	private String id;
	
	int[] class_per_day = new int[GlobalVar.DAYS];	//number of classes taken in a day . there are 5 working days in a week
	
	//Constructor for test cases 
	public Faculty() { 
		
	}
	public Faculty(String name,String id){
		this.name=name;
		this.id=id;
	}
	
	//list of faculty
	public Map<String,Faculty> getFaculty() throws SQLException{	
		FacultyDB f = new FacultyDB();
		return f.getAllFaculty();
	}
	 
	//get function for all the attributes of the class
	public int getClassPerDay(int day) {
		return this.class_per_day[day];
	}
	public void inrClassPerDay(int day) {
		this.class_per_day[day]++;
	}
	
	public String getFacName() {
		return this.name;
	}
	public void setFacName(String name) {
		this.name = name;
	}

	public String getFacId() {
		return id;
	}
	public void setFacId(String id) {
		this.id = id;
	}	
}
