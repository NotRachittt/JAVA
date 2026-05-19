class Papaa{
	void msg01() {
		System.out.println("Hello Papa here");
	}
}
class Beta extends Papaa{
	void msg02() {
		System.out.println("Hello Beta here");
	}
}
class Pota extends Beta{
	void msg03() {
		System.out.println("Hello Pota here");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		
		Beta s1 = new Beta();
		s1.msg01();
		s1.msg02();
		
		Pota s2 = new Pota();
		s2.msg01();
		s2.msg02();
		s2.msg03();
	}
}
