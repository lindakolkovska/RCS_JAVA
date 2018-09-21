import java.util.Scanner;
import java.util.Random;

public class Loops_tasks {

	public static void main(String[] args) {
		

		Random rnd = new Random();
		int x = rnd.nextInt(11); // tikai ar pozitîviem skaitïiem
		x = x -5;			// bûs no -5 lîdz 5

		//alternatîva manai versijai, kas ir apakðâ
//		System.out.print("Ievadi veselu skaitli:");
//		Scanner scanner = new Scanner(System.in);
//		int x = scanner.nextInt();
		
		System.out.print(" " + x + "->");
		
		int from = 0;
		int to = x;
		
		if (x < 0) {
			from = x;
			to = 0;
		}
		
		for (int i = from; i <= to; i++) {
			if (i == from) {
				System.out.print(i);
			} else {
				System.out.print("," + i);
				//string sep = (i == from) ? "" : ","
			}
			
		}
		
		
		
//		if (x >= 0) {
//			System.out.print(x + "->"+ " ");
//			for (int i = 0; i <= x; i++) {
//				System.out.print("," + i);
//			}		
//		}
//		
//		if (x < 0) {
//			System.out.print(x + "->"+ " ");
//			for (int i = x; i <= 0; i++) {
//				System.out.print("," + i);
//		}
//		}		
		//scanner.close();
	}

}
