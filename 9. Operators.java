
public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators
		int a = 1;  // assignment operator "="
		int b = 2;
		
		int add = a + b;
		System.out.println(add);
		
		int diff = a - b;
		System.out.println(diff);
		
		int mul = a * b;
		System.out.println(mul);
		
		float div = b / a;
		System.out.println(div);
		
		float modulo = a % b;
		System.out.println(modulo);
		
		//Unary operator
		int numb = 1;
		numb++;
		System.out.println("----->" +numb);
		
		//Comparison operator
		// a == b checks if both values are equal
		// a != b checks if both values are unequal
		//a < b and a <= b
		//a > b and a >= b
		
		
		//Logical Operator
		
		//&& if both conditions is true then output is true
		int x = 5;
		int y = 6;
		
		if (x<10 && y<10) {
			System.out.println("Trueee");
		}
		else
			System.out.println("Falsee");
		
		// || this OR one condition should be true.
		if (x>10 || y>10) {
			System.out.println("Trueee");
		}
		else
			System.out.println("Falsee");

		// ! this is negative false to true and vice versa
		boolean question = true;
		if (!question) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		
	}

}
