package methods;

public class Variable_argument {

	public static void main(String[] args) {

		int sum = sumMethod(2, 3, 3, 45, 5);

		System.out.println(sum);
	}

	public static int sumMethod(int... numbers) {
		int sum = 0;

		for (int num : numbers) {
			sum = num + sum;
		}
		return sum;

	}

}
