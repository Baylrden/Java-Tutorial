
public class Arrays {

	public static void main(String[] args) {
		//method 1
String array[] = {"Jeff","Kowalski","Roark","Skipper"};

System.out.println(array[0]);




//method 2
int[] numbers = new int[3];

numbers[0]=0;
numbers[1]=1;
numbers[2]=2;

for(int i=0;i<numbers.length; i++)
{
	System.out.println(numbers[i]);
}
		
		

for(int nums:numbers) 
{
	//most used method
	System.out.println(nums);
}
		



	}

}
