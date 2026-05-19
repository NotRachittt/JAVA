class Human{
	int age;
	String name;
	//compiled time polymorphism
	
	public void data(String name) {
		System.out.println(name);
	}
	
	public void data(int age) {
		System.out.println(age);
	}
}
public class Method_overloading {

	public static void main(String[] args) {

		Human sc = new Human();
		sc.name = "Rachit";
		sc.age = 18;
		
		sc.data(sc.name);
		sc.data(sc.age);
	}

}
