package h;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		while(true){
			System.out.println("Please enter a number =");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			if(number == -1) {
				System.out.println("\nHave a good day");
				break;
			}
			int len = String.valueOf(number).length();
			int value = 0;
			int rem = 0;
			int first = number;
			if(len==7){
				for(int i = 0; i<len;i++) {
					rem = number % 10;
					value =value*10+rem;
					number = number/10;
				}
				if(value==first) {
					System.out.println("This is a palindrome");
				}
				else {
					System.out.println("This is a not a palindrome");
				}
			}
			else {
				System.out.println("You entered  out of 7 digits place.");
			}
		}
	}

}
