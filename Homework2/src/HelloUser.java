import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		System.out.print("Ievadi v�rdu un uzv�rdu:");
		Scanner scanner = new Scanner(System.in);
		String firstText = scanner.nextLine();
		firstText = firstText.trim();
		String[] splited = firstText.split(" "); // int index = firstText.indexOf(" ") -> String firstName = firstText.substring(0, index).trim();
		
		if (splited.length >= 2) {
			for (int i = 0; i < splited.length; i++) {
				System.out.println(splited[i] + " ");
			}
			
			String word1 = splited[0].substring(0, 1).toUpperCase() + splited[0].substring(1); // ja nenor�da beigu v�rt�bu, resp., splited[0].length(), saprot, ka j�nem l�dz beig�m
			String word2 = splited[1].toUpperCase();			
			
			System.out.println("'" + word1 + "'");
			System.out.println("'" + word2 + "'");
		} else {
			System.out.println("Ievad�ts tikai v�rds vai uzv�rds. L�dzu, ievadiet abus");
		}
		
		
		scanner.close();
	}

}
