package enum1;

import java.lang.reflect.Array;

public class Main {

enum Planets{
		 MERCURY("One"),
		 VENUS("Two"),
		 EARTH("Three"),
		 MARS("Four"),
		 JUPITER("Five"),
		 SATURN("Six"),
		 URANUS("Seven"),
		 NEPTUNE("Eight"),
		 PLUTO("Nine");

		String number;
		
		Planets(String number)
		{
			this.number = number;
		}
	}

	public class trials {
		
			public static void main(String[] args) {
					Planets myPlanet =Planets.EARTH;
					
					isAvailableForHumanity(myPlanet);
					
			}
			
				
				static void isAvailableForHumanity(Planets myPlanet)
				 {
					 switch(myPlanet)
					 {
					 case EARTH:
						 System.out.println("Yes, this planet is available for humanity!");
						 System.out.println("This is planet number :" + Planets.EARTH.number);
						 break;
						 
						 default:
							 System.out.println("No, this planet is not available for humanity!");
							 System.out.println("This is planet number :" + Planets.EARTH.number);
					 }
				 }
				
			}
				


}
