class Car{										//class
	String Color;
	String Type;
	
	public void drive() { 							//METHOD 
		System.out.println("Zoooommmmmm...");
	}
	
	public void data() {
		System.out.println(this.Color);    // 'this' tells who called this function
	}
}

class Showroom {							//class
	String name;							//properties
	int km;
	
	public void city() {						//methods
		System.out.println(this.name);
		System.out.println(this.km);
		
	}
}

public class Class_Object {

	public static void main(String[] args) {
		
		Car bmw= new Car();     		   //object 01
		bmw.Color = "Matte_Black";      //properties calling
		bmw.Type = "Sport";
		
		bmw.drive(); 
		bmw.data();					//Method calling
		
		Car dodge = new Car();			//obejct 02
		dodge.Color = "Red";
		dodge.Type ="Race";
		
		dodge.drive();
		dodge.data();
		
		///////////////////////////////////////////
		
		Showroom s1 = new Showroom();
		s1.name = "Delhi";
		s1.km = 550;
		
		s1.city();
	}

}
