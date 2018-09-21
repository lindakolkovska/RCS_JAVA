import java.util.Scanner;

public class Arrray_task1 {

	public static void main(String[] args) {
		
		System.out.println("Ievadi 1 burtu:");
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		
		String[] patskani = {"a", "e", "i", "o", "u"};
		String[] lidzskani = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "z"};
		String[] daudzskanis = {"o"};
		
		for (int i = 0; i < patskani.length; i++) {
			if (x == patskani[i]) {
				String patskanis = x;
			}
		}

		if (x == patskanis) {
			System.out.println(x + " burts ir patskanis");

		} else if (x == lidzskani){
			
			
		}
		
		scanner.close();
	}

}
