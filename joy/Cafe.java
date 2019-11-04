package org.task.joy;

public class Cafe {
	//Cafe class with getters and setters method
	
	private String name;
	 private String place_id;
	 public Cafe()//default constructor 
	 {
		 
	 }
	 public Cafe(String name,String id)//argument constructor
	 {
		 this.name=name;
		 this.place_id=id;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

}
