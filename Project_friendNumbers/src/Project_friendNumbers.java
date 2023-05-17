
public class Project_friendNumbers {

	public static void main(String[] args) {

		int number1 = 220;
		int number2 = 284;
		
		int totalDivisors1=0;
		int totalDivisors2=0;
		
		for(int i=1;i<number1;i++)
		{
			if(number1 % i == 0)
			{
				totalDivisors1=totalDivisors1+i;
			}
		}
		
		for(int i=1;i<number2;i++)
		{
			if(number2 % i == 0)
			{
				totalDivisors2=totalDivisors2+i;
			}		
		}
		
		if(totalDivisors1==number2 && totalDivisors1 == number2)
			System.out.println(number1 + " and " + number2 + " are the friend numbers.");
		
		else
			System.out.println(number1 + " and " + number2 + " are not friend numbers.");
		
	}

}
