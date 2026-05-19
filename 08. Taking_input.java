import java.util.Scanner;

public class Taking_input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your age : ");
		int age = sc.nextInt();
		System.out.println("---> "+age);
		
		System.out.print("What is your name : "); //to get single word
		String name = sc.next();
		System.out.println("---> "+name);
		
		System.out.print("What is your full name : "); //to get sentence
		sc.nextLine();
		String sent = sc.nextLine();
		System.out.println("---> "+sent);

	}

}
