
public class Project_PrimeNumber {

	public static void main(String[] args) {

		int number = 10;
		boolean decision=true;
		
		
		if(number<2)
		{
			System.out.println("Invalid number");
            return;
		}
		
		
		
		 for(int i=2;i<number;i++)
		 {
			 if(number%i==0)
				 decision=false;
			 
		 }
		 
		 if(decision==false)
			 System.out.println(number+" is not a prime number");
		 
		 else
			 System.out.println(number+" is a prime number");

		 
		
			 
		
		
		
	}

}
