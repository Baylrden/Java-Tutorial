package arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList <String> Country  = new ArrayList <String>();
		
		Country.add("Azerbaijan");
		Country.add("Turkey");
		Country.add("Brazil");
		Country.add("Argentina");
		Country.add("Azerbaijan");
		
		System.out.println("COUNTRIES:");
		for(String c: Country)
		{
			System.out.println(c);
	    }
		
		System.out.println("Index of Azerbaijan:"+ Country.indexOf("Azerbaijan"));
		System.out.println("Index of 'last' Azerbaijan:"+ Country.lastIndexOf("Azerbaijan"));
		System.out.println("Do 'Country' contains Azerbaijan? : "+ Country.contains("Azerbaijan"));
		System.out.println("remove first index : "+ Country.remove(2));
		System.out.println("Country in index No:2 will be 'USA' : "+ Country.set(2, "USA"));
		
		for(int i=0; i<Country.size(); i++)
		{
			System.out.println(Country.get(i));
		}
  }
	
	
}
