package org.task.joy;

public class Cafe {
	private String name;
	 private String place_id;
	 public Cafe(String name,String id)
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
