import java.util.Scanner;

public class Method_Functions { //THIS MAIN CLASS
	
	public static void printJava() { //making a METHOD in main //in this method its giving nothing in output so its void.
		
		System.out.println("hello sir, whats going on.");

	}
	
	public static void PrintName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter String name : ");
		String name01 = sc.next();
		
		System.out.println(name01 +" Is a good boy/girl.");
	}
	
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of number is : "+sum);
	}

	public static void main(String[] args) {
		
		//METHODS IS FUNCTION THAT IS WRITTEN INSIDE CLASS.
			//FUNCTION :- performing any operation.  
		
		//Methods
		printJava();
        printJava();
        printJava();
        
        PrintName();
        
        add(5,5);
		
		//for doing any operation repeatedly - make a method


	}

}
