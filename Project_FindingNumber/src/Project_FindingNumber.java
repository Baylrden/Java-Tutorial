
public class Project_FindingNumber {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5};
		
		int searching=2;
		
		boolean includes=false;
		
		
		for(int number:numbers)
		{
			if(number==searching)
			{
				includes=true;
				break;
			}
			
		}
		
		
		
		
		if(includes==true)
			System.out.println("This list includes "+ searching);
		else
			System.out.println("This list does not includes "+ searching);

	   }

	}

