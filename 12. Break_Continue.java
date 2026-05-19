
public class Break_Continue {

	public static void main(String[] args) {
		
		//BREAK & CONTINUE
		//we put true in while to make that run for infinity to break that we use "break"
		int i =1;
		while(true) {
			if(i==3) {
				i = i+1;
				continue; //CONTINUE :- 3 comes in this block then i becomes 4 and i prints then 4 becomes 5 and prints then break...
			}
			System.out.println(i);	//i prints
			i = i+1;
			if(i>5) {
				break;    // "BREAK" breaks the infinite loop 
			}
		}
	}

}
