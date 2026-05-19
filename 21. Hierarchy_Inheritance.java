class Papa{
	void data() {
		System.out.println("Hello im Papa");
	}
}

class Beta01 extends Papa{
	void data01(){
		System.out.println("Hello im Beta01");
	}
}

class Beta02 extends Papa{
	void data02() {
		System.out.println("Hello im Beta02");
	}
}
public class Hierarchy_Inheritance {

	public static void main(String[] args) {

		Beta01 s1 = new Beta01();
		s1.data();
		s1.data01();
		
		Beta02 s2 = new Beta02();
		s2.data();
		s2.data02();
		
	}

}
