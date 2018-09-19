import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		System.out.print("Ievadi veselu skaitli:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.print("Ievadi veselu skaitli:");
		int number2 = scanner.nextInt();
		System.out.println("Ievadîto skaitïu summa ir " + (number + number2));
		
		System.out.println("Ievadi 3 veselus skaitlïus:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		double avg = (x+y+z)/3.0;
		System.out.println("Ievadîto skaitïu vidçjâ vçrtîba ir " + avg);
		
		System.out.println("Ievadi 2 veselus skaitlïus:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a+b > 10 && a+b < 19) {
			System.out.println("Ievadîto skaitïu summa ir " + 20);
		} else {
			System.out.println("Ievadîto skaitïu summa ir " + (a + b));
		}
		
		scanner.close();
	}

}
