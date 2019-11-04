package org.task.joy;

public class Place {
	
	//Place class with getters and setters method
	
	private String id;
	private String street_no;
    private String locality;
    private String postal_code;
    private String lat;
    private String long_key;
	
	public Place(){}	//default constructor 
	
	//argument constructor
    public Place(String id,String street,String locality,String postal,String lat, String long_key)
    {
    	this.id = id;
    	this.street_no = street;
    	this.locality = locality;
    	this.postal_code = postal;
    	this.lat = lat;
    	this.long_key  = long_key;
    }
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreet_no() {
		return street_no;
	}
	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLong_key() {
		return long_key;
	}
	public void setLong_key(String long_key) {
		this.long_key = long_key;
	}
	
}

