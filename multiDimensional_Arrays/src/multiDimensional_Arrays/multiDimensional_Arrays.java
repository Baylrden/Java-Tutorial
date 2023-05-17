package multiDimensional_Arrays;

public class multiDimensional_Arrays {

	public static void main(String[] args) {
		
       String[][] cities = new String[3][3];
		
       cities[0][0]="Istanbul";
       cities[0][1]="Bursa";
       cities[0][2]="Bilecik";
       cities[1][0]="Ankara";
       cities[1][1]="Sivas";
       cities[1][2]="Konya";
       cities[2][0]="Izmir";
       cities[2][1]="Denizli";
       cities[2][2]="Usak";
       
       
       for(int i=0 ; i<3 ; i++)
       {
    	   System.out.println("-----------------");
    	   for(int j=0 ; j<3 ; j++)
    	   {
    		   System.out.println(cities[i][j]);
    	   }
       }
       
       
       
       
       
       
       
       
   
	}

}
