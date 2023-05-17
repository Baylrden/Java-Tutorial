package classes;

public class Classes1 {
	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager = new CustomerManager();

		customerManager.Add();
		customerManager.Delete();
		customerManager.Delete();
         //value type
		int num1 = 10;
		int num2 = 20;

		num2 = num1;
		num1 = 30;

		System.out.println(num2);

		
		//reference type
		int numbers1[] = new int[] { 1, 2, 3 };
		int numbers2[] = new int[] { 4, 5, 6 };

		numbers2 = numbers1;

		numbers1[0] = 11;

		System.out.println(numbers2[0]);
		
		
	

	}

}