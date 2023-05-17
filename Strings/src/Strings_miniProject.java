
public class Strings_miniProject {

	public static void main(String[] args) {
		
		String message = "    My name is Jeffrey.But you can call me Jeff.";

		
		
		System.out.println(message.replace('a', 'b'));
		
		
		System.out.println(message.substring(11));
		
		
		System.out.println(message.substring(11,26));
		
		
		for(String word:message.split(" "))
		{
			System.out.println(word);
		}
		
		
		System.out.println(message.toLowerCase());

		System.out.println(message.toUpperCase());
		
		
		System.out.println(message.trim());
	}

}
