package org.task.joy;

public class ResultList {
	
	private Cafe cafe;
	private Place place;
	
	public Cafe getCafe() {
		return cafe;
	}
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	
	@Override 
	public String toString(){
		return "    { \n    Name = "+cafe.getName()+"\n    street_no = "+place.getStreet_no()+"\n    locality = "+place.getLocality()
		+ "\n    postal_code = "+place.getPostal_code()+"\n    lat = "+place.getLat()+"\n    long = "+place.getLong_key()+" \n    }" ;
	}

}
