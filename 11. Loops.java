
public class Loops {

	public static void main(String[] args) {
		
		//LOOPS
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		//if we want to print 1-100 for this we use loop
		// for loops, do while loops, while loops
		
		// FOR LOOP :- SYNTAX for(initialize ; condition ; update)
		for(int i = 1; i <=100 ; i++) {
			System.out.println(i);
		}
		
		//WHILE LOOP
		int j =100;
		while(j>=1) {
			System.out.println(j);
			j = j-1;
		}
		
		//DO WHILE LOOP first we run code then we check condition
		int k =100;
		do{
			System.out.println(k);
			k = k-1;
		} while(k>=1);

	}

}
