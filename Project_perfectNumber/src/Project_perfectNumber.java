
public class Project_perfectNumber {

	public static void main(String[] args) {

		int number=28;
		int divisorsTotal=0;
		for(int i=1;i<number;i++)
		{
			if(number % i==0)
				divisorsTotal=divisorsTotal+i;
				
		}
		
		if(divisorsTotal==number)
		
			System.out.println(number + " is a perfect number.");
		
		
		
		else
			System.out.println(number + " is not a perfect number.");

		
		
			
	}

}
