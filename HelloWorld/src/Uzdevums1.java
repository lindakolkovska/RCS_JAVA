import java.util.Scanner;

public class Uzdevums1 {

	public static void main(String[] args) {
//		int a = 6;
//		int b = 9;
//		System.out.println("a+b ir " + a + b);
//		
//		int x = 32;
//		int y =11;
//		int z = 4;
//		double avg = (x+y+z)/3.0;
//		System.out.println("vid.aritm. ir " + (double)avg);
		
		System.out.println("Ievadi k�du v�rdu:");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		System.out.println("Tu ievad�ji: '" + name + "'");
		
		System.out.println("Ievadiet veselu skaitli: ");
		int number = scanner.nextInt();
		System.out.println("Tu ievad�ji: '" + number + "'");
		
		System.out.println("Ievadiet decim�lskaitli: ");
		double dnumber = scanner.nextDouble();
		System.out.println("Tu ievad�ji: '" + dnumber + "'");
		
		
		scanner.close();
	}

}
