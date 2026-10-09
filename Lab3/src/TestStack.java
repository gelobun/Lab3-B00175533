import java.util.Scanner;

public class TestStack {
	private static Object openBrace;
	private static boolean balancedSoFar;
	private static int k;


	public static void displayMenu() {
		System.out.println("Welcome to StackTest! Please select a number from the list.");
		System.out.println("1. Push a string on to the stack");
		System.out.println("2. Pop a string from the stack");
		System.out.println("3. Peek at the top of the stack");
		System.out.println("4. Empty the stack");
		System.out.println("5. Check if a string has balanced brackets.");
		System.out.println("6. Quit the program");
		
		
	}
	
	public static boolean isBalanced(String s) {
		return false;
	}

	
	
	public static void main(String[] args) {
		StackReferenceBased stack = new StackReferenceBased();
		Scanner s = new Scanner(System.in);	
		
		displayMenu();
		
		System.out.println("Enter the number: ");
		int response = s.nextInt();
		s.nextLine();
	
		switch(response) {
		case 1: 
			System.out.println("1. Push a string on to the stack");
			break;
		case 2:
			System.out.println("2. Pop a string from the stack");
			break;
		case 3:
			System.out.println("3. Peek at the top of the stack");
			break;
		case 4:
			System.out.println("4. Empty the stack");
			break;
		case 5:
			System.out.println("5. Check if a string has balanced brackets.");
			break;
		case 6:
			System.out.println("6. Quit the program");
			break;
		} System.out.println();
		
		displayMenu();
		
		stack.push(s);
		stack.pop();
		stack.peek();
		
			
		
		/*stack.CreateStack();
		balancedSoFar = true;
		k = 0;
		Object aString;
		while(balancedSoFar && k < aString.length()) {
			
		}*/
			
		}
	
		
		
		
		
		/*do {
			displayMenu();
			respone = s.nextInt();
			System.out.println("Enter the number: " + s);
				switch(respone) {
				case 1: 
					String s1 = s.nextLine();
					System.out.println("1. Push a string on to the stack");
					break;
				case 2:
					String s2 = s.nextLine();
					System.out.println("2. Pop a string from the stack");
					break;
				case 3:
					String s3 = s.nextLine();
					System.out.println("3. Peek at the top of the stack");
					break;
				case 4:
					String s4 = s.nextLine();
					System.out.println("4. Empty the stack");
					break;
				case 5:
					String s5 = s.nextLine();
					System.out.println("5. Check if a string has balanced brackets.");
					break;
				case 6:
					String s6 = s.nextLine();
					System.out.println("6. Quit the program");
					break;
				} while (respone != 6) { */
				
		
					
	

}
