class Shape{
	int sides;
	
	void data() {
		System.out.println("This is parent");
	}
}

class triangle extends Shape{
	void data01(){
		System.out.println("This is trinagle and it has "+sides+" sides");
	}
}
public class Single_Inheritance {
	public static void main(String[] args) {

		triangle s1 = new triangle();
		s1.sides=3;
		s1.data();
		s1.data01();
	}

}
