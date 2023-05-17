
public class Strings {

	public static void main(String[] args) {
		

		String message = "My name is Jeffrey.But you can call me Jeff.";
		
		System.out.println(message);
		
		System.out.println("Number of characters:"+message.length());
		
		System.out.println("5th character:" + message.charAt(4));
		
		System.out.println(message.concat(" :)"));
		
		System.out.println(message.startsWith("M"));
		
		System.out.println(message.endsWith("."));
		
		char[] chars = new char[10];
		
		
		
		message.getChars(0 , 7,chars,0);
		
		System.out.println( chars);
		
		System.out.println(message.indexOf("But"));
		
		System.out.println(message.lastIndexOf("can"));
		
		
		
		
	}

}
