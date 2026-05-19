import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//TRY - CATCH
		
		int[] marks = {17,18,19};
		
		
		//System.out.println(marks[5]);   //gives exception error beacure 5 is out of bound
		//System.out.println("Hello this msg is after error.");  //this next statements or code msgs will not display if exception error occurs.
		
		
		System.out.print("What index to get : ");
		int i = sc.nextInt();
		
		//TRY 
		try {
			System.out.println(marks[i]); //try if error is there or not
		}
		catch(Exception exception) { //do something after catching error
			System.out.println("Something went wrong :( ");
		}
		
		//then after coming exception error further code will still run unlike first case
		
	}

}
