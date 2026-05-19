abstract class Animal{
	abstract void walk();
}

class Horse extends Animal{
	public void walk() {
		System.out.println("Horse is walking.");
	}
}

class Rabbit extends Animal {
	public void walk() {
		System.out.println("Rabbit is jumping.");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		Horse s1 = new Horse();
		s1.walk();
	}

}
