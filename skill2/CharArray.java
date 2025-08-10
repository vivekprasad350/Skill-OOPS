package skill2;

import java.util.Scanner;

public class CharArray {
	public static void main(String args[]) {
		char[] CharArray = {'H', 'e', 'l', 'l', 'o'};
		
		String str1;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered String: ");
		str1 = sc.nextLine();	
		
		System.out.println("Character array as String: "+ new String(CharArray));
		
		System.out.println("Entered String: "+ str1);
		
		String str2 = new String(CharArray);
		
		System.out.println("String from character array: "+ str2);
		
	}

}
