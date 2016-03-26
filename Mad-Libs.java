//import scanner
import java.util.Scanner;

public class Mad_Libs {

	public static void main(String[] args) {
		//variables for words
		Scanner input = new Scanner (System.in);
		String adj1;
		String n1;
		String v1;
		String n2;
		String n3;
		String v2;
		//asking for words
		System.out.println("adjective:");
		adj1 = input.nextLine();
		
		System.out.println("noun");
		n1 = input.nextLine();
		
		System.out.println("verb");
		v1 = input.nextLine();
		
		System.out.println("noun");
		n2 = input.nextLine();
		
		System.out.println("noun");
		n3 = input.nextLine();
		
		System.out.println("verb");
		v2 = input.nextLine();
		
		//say story with variable values
		System.out.println("Copper");
		System.out.println("Coppper is a very " + adj1 + ", " + n1);
		System.out.println("It can be used to " + v1 +  " a " + n2);
		System.out.print("and " + v2);
		System.out.print( " a " + n3 );
		System.out.print(".");
		
		//closing scanner
		input.close();
		
	}
}
