package ScannerTutorial;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int age;
		int gf;
		
		System.out.println("how old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("how many girlfriends do you have? ");
		gf = keyboard.nextInt();
	
		System.out.println("you are " + age + " years old. "
				+  "You have " + gf + " girlfriends(s).");
	}

}
