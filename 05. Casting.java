public class Casting {

	public static void main(String[] args) {
		
		//CASTING
		
		double price = 100.00;
		double finalprice = price + 18; //implicit casting (small in big)
		
		System.out.println(finalprice); // this works
		
		int p = 100;
		//int fp = p + 18.0; //error due to casting
		
		//For example : you can transfer water from glass to bucket but you can't transfer water from bucket to glass as capacity of both differs same happens here size of int is 4 but size of double is 8.
		
		//explicit casting - manually changing datatype 
		int pp = 100;
		int fpp = pp + (int)18.00;
		System.out.println(fpp);
		

	}

}
