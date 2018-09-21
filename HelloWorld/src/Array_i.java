import java.util.Random;

public class Array_i {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intArr = new int[3];
		for (int i=0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(101);
		}
		
		int[] counters = new int[101];
		
		for (int i=0; i < intArr.length; i++) {
			int cIndex = intArr[i];
			counters[cIndex]++;
			System.out.println(intArr[i]);
			
		
		}
		
		
		int[] intArray = {1, 2, 3};
	}

}
