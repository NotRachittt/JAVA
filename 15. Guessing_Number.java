import java.util.Scanner;

public class Guessing_Number {

	public static void main(String[] args) {
		
		int number = (int) (Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("\nGuess a number between 1 to 100 : ");
			int guess = sc.nextInt();

			
			if(number == guess) {
				System.out.println("YAYAYA... You guessed the number.");
				break;
			}
			else if (number > guess) {
				System.out.println("Your number is smaller.");
			}
			else if (number<guess) {
				System.out.println("Your number is greater.");
			}
		}
		while(true); {
			System.out.println("My number was "+number);
		}

	}

}
