import java.util.Arrays;

public class Arrayss {

	public static void main(String[] args) {
		int phy = 49;
		int chem = 45;
		int math = 27;
		int bio = 46;
		
		int [] marks = new int[4]; // non primitive so make 'new' 
		marks[0] = 49;
		marks[1] = 45;
		marks[2] = 27;
		marks[3] = 46;
		
		System.out.println(marks[2]);
		
		//LENGTH
		System.out.println("Length of array is " +marks.length);
		
		//SORT
		System.out.println(marks[0]); //Before sorting 49,45,27,46
		Arrays.sort(marks);
		System.out.println(marks[0]); // After sorting 27,45,46,49
		
		// if we know values we can initialize like this
		int[] marks01 = {10,11,12,13,14,15};
		
		//2D Array
		int [][] marks02 = {{1,2,3},{7,8,9}};
		System.out.println(marks02[0][0]);
		System.out.println(marks02[1][1]);
		System.out.println(marks02[0][1]);
	}

}
