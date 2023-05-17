package methods;

public class Methods2 {

	public static void main(String[] args) {

		String message = "my name is Gustavo.";

		String newMessage = message.substring(11, 18);

		System.out.println(newMessage);

		String message2 = message2();

		System.out.println(message2);

		int result = sum(3, 7);

		System.out.println(result);
	}

	public static int sum(int num1, int num2)

	{
		return num1 + num2;
	}

	public static String message2() {
		return "Hello";
	}

}
