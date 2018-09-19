import java.util.Scanner;

public class Uzdevums2 {

	public static void main(String[] args) {
		
		System.out.println("Ievadi 3 veselus skaitlïus:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
//		if (x == y) {
//			System.out.println("Ievadîto skaitïu summa ir " + (x + z));
//		} else if (x == z || y == z) {
//			System.out.println("Ievadîto skaitïu summa ir " + (x + y));
//		} else {
//			System.out.println("Ievadîto skaitïu summa ir " + (x + y + z));
//		}
		
		if (x == z && x == y && y == z) {
			System.out.println("Ievadîto skaitïu summa ir " + 0);
		} else if (x == z) {
			System.out.println("Ievadîto skaitïu summa ir " + y);
		} else if (y == z) {
			System.out.println("Ievadîto skaitïu summa ir " + x);
		} else if (x == y) {
			System.out.println("Ievadîto skaitïu summa ir " + z);
		} else {
			System.out.println("Ievadîto skaitïu summa ir " + (x+y+z));
		}
				
				
		scanner.close();
	}

}
