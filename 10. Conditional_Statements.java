
public class Conditional_Statements {

	public static void main(String[] args) {
		
		//conditional statement 
		boolean isSunUp = false;
		if(isSunUp == true) {
			System.out.println("day");
		}
		else
			System.out.println("night");
		
		
		int age = 3 ;
		if (age >18) {
			System.out.println("Can Vote");
		}
		else
			System.out.println("Can't vote");
		
		//SWITCH
		int day = 1; //1 - monday, 2 - tuesday....
		
		//jis bhi case se match hogi value uske niche wale sare catch ouput de denge to stop this use "break;"
		
		switch(day) {
		case 1 : 
			System.out.println("Monday");
		case 2 : 
			System.out.println("Tuesday");
		case 3 : 
			System.out.println("Wednesday");
			break;
		default :
			System.out.println("Thus - Sun");
		}
	}

}
