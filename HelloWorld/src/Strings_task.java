import java.util.Scanner;

public class Strings_task {

	public static void main(String[] args) {
//		String str = "abc";		// abc
//		str = str.concat("d");	//abcd
//		str = str + "e";		//abcde
//		str = str.toUpperCase();//ABCDE
//		str = str.toLowerCase();//abcde
//		str = str.substring(1);//bcde
//		str = str.substring(2, 4);// no bcde uz de
//		boolean eq = str.equals("list");
//		str = str.trim(); // bez atstarpçm
		
		System.out.print("Ievadi tekstu:");
		Scanner scanner = new Scanner(System.in);
		String firstText = scanner.nextLine();
		firstText = firstText.trim();
		
		System.out.print("Ievadi tekstu:");
		String secondText = scanner.nextLine();
		secondText = secondText.trim();
		
		if (firstText.length() > secondText.length()) {
			System.out.println("Saliekot kopâ: '" + secondText + firstText + secondText + "'");
		} else {
			System.out.println("Saliekot kopâ: '" + firstText + " " + secondText + " " + firstText + "'");
		}		

		scanner.close();
	}

}
