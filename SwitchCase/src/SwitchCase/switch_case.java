package SwitchCase;

public class switch_case {

	public static void main(String[] args) {
		char grade='A';
		
		switch(grade) {
		case 'A':
			System.out.println("Passed with 'A' ");
			break;
			
		case 'B':
			System.out.println("Passed with 'B' ");
			break;
			
		case 'C':
			System.out.println("Failed with 'C' ");
			break;
			
			default:
				System.out.println("Invalid input. ");
		}
		
		
		
		
	}
}
