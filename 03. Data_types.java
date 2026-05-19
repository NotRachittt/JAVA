
public class Data_types {

	public static void main(String[] args) {
		// Primitive value
		//byte - 1 	[-128 to 127]
		// short - 2
		//int - 4 	[1,2,3,4...]
		//long - 8	 [1243546...]
		//float - 4 	[3.14]
		//double - 8 	[3.141569...]
		//char - 2
		//boolean - 1 	true/false
		
		byte age = 30;
		int phone = 1234567890; 
		long phone2 = 12345678900L;
		
		float pi = 3.14F;
		char letter = '#';
		boolean shot = true;
		
		//Non - primitive values
		// fixed size 
		//strings are immuatable
		String name = ("rachit");
		String name0 = new String ("rachit"); // to modify we can create new string
		System.out.println("length of string - "+name.length());
	
		String name1 = "Riya";
		String name2 = "Shreya";
		String name3 = name1 + " and "+ name2;  //concatination of string
		System.out.println(name3);
		
		System.out.println(name1.charAt(0));
		System.out.println(name2.charAt(4));
		System.out.println("length of string is "+name1.length());
		System.out.println(name2.replace('a', 'u'));
		
		//sub string
		String toy = "Heart";
		System.out.println(toy.substring(0,3)); //priniting limits
		System.out.println(toy.substring(2,5)); //priniting limits
	}

}
