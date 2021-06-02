package name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.println("Quel est votre nom?");
		String userName = myObj.nextLine();
		System.out.println("Bonjour " + userName);
	}

}
