package org.task.joy;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cafe Name please");
		String keyword = sc.next();		//this String enter by user and need to search in Cafes and Places
		
		Search search = new Search();	//create of object main class because its method are not static. 
		
		ArrayList<ResultList> result = search.findCaliforniaCafes(keyword);//calling method and passing argument keyword.

	    if(result==null || result.isEmpty()) {//checking list is null or empty. 
	    	System.out.println("No such data found!...... ");
	    }
	    else {//If it have value then print them.
	    	System.out.println("[");
	    	for(ResultList list : result){//fetching value  ArrayList of ResultList entity.
	    		System.out.println(list);
	    	}
	    	System.out.println("]");
	    }

	}
	
	ArrayList<ResultList> result = new ArrayList<>();//Creating the member variable of this class.Variable nature is ArrayList of bean class  ResultList. 
	
	ArrayList<Cafe> cafes = new ArrayList<>();//Creating the member variable  this of class.Variable nature is ArrayList of bean class  Cafe.
	
	ArrayList<Place> places=new ArrayList<>();//Creating the member variable  this of class.Variable nature is ArrayList of bean class  Place.
	
	public Search(){//This constructor help to define the value of cafes and Places
		//Just create object of bean class and putting value using constructor
		Cafe cafe1=new Cafe("Bazaar cafe","kjk234g4gcvfx8usg1l33pi");
		Cafe cafe2=new Cafe("Ashley's cafe","12hydbdf76sljfts87sbfis");
		Cafe cafe3=new Cafe("Avenue cafe","skjd86svvfdrsv55svbvf3f");
		Cafe cafe4=new Cafe("Hi-Lo cafe","mjdhgetr4pojfyts22fzfsh");
		Cafe cafe5=new Cafe("California chicken  cafe","12hydbdf76sljfts87sbfis");
		Cafe cafe6=new Cafe("Avenue Bakery Cafe","12hydbdf76sljfts87sbfis");
		Cafe cafe7=new Cafe("Philz Coffee","urhw3837ehalod7w02b7835");
		//Push them in ArrayList of cafe  
		cafes.add(cafe1);
		cafes.add(cafe2);
		cafes.add(cafe3);
		cafes.add(cafe4);
		cafes.add(cafe5);
		cafes.add(cafe6);
		cafes.add(cafe7);
		//Just create object of bean class and putting value using constructor
		Place place1=new Place("jahgde7wgdiau8ewsahgosd","60H","Solomos Island Road","20688","36.7783 N","119.4179 W");
		Place place2=new Place("12hydbdf76sljfts87sbfis","1B","Macarthur Blvd","20619","38.1781 N","118.4171 W");
		Place place3=new Place("kjk234g4gcvfx8usg1l33pi","45250","Worth Avenue, Unit A","20619","36.1152","117.521");
		Place place4=new Place("saswe3s6yydtdr52hsd72yst","1X","Macarthur Blvd","20687","36.7783","119.4179");
		Place place5=new Place("skjd86svvfdrsv55svbvf3f","7S","Three Notch Road","20619","36.83","119.6");
		Place place6=new Place("mjdhgetr4pojfyts22fzfsh","22803","Gunston Dr Lexington Park","20688","35.7788","119.979");
		Place place7=new Place("urhw3837ehalod7w02b7835", "225","Macarthur Blvd","20687","35.77813","119.41791");
		//Push them in ArrayList of Place 
		places.add(place1);
		places.add(place2);
		places.add(place3);
		places.add(place4);
		places.add(place5);
		places.add(place6);
		places.add(place7);
		
	}
	
	public ArrayList<ResultList> findCaliforniaCafes(String search)//This method help to search details of cafe and place against the parameter string 'search'.  
	{		
				
		for(Cafe cafe:cafes)//Fetching the value of ArrayList of Cafes using forEach loop.
		{
			if((cafe.getName().toLowerCase()).contains(search.toLowerCase()))//insensitive checking equal or not.
			{
				for( Place place : places)//Fetching the value of ArrayList of Place using forEach loop.
				{	
					if((cafe.getPlace_id()).equalsIgnoreCase(place.getId()))//Just checking the mapping 'ID' same or not. 
					{
						ResultList var = new ResultList();//Creating the object of  bean or entity ResultList.  
						var.setCafe(cafe);
						var.setPlace(place);
						result.add(var);//Pushing getting the value of cafe and place in object of ResultList
					}
			   }
			}
		}
		return(result);//Here return the resulting result. 
		
	}
}
