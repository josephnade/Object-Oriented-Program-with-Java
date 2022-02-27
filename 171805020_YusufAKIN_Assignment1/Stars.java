package h;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		System.out.println("Please enter a number =");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int i = 0;
		//Aþaðýdaki git gide artan sola yaslý
		while(i<=number) {
			for(int counter = 0 ;counter<=i;counter++) {
				System.out.print("*");
			}
			System.out.print("\n");
			i++;
		}
		System.out.print("\n");
		//Aþaðýdaki git gide azalan sola yaslý
		while(i!=0) {
			for(int counter = i ;counter!=0;counter--) {
				System.out.print("*");
			}
			System.out.print("\n");
			i--;
		}
		System.out.print("\n");
		int counter=number;
		//Aþaðýdaki git gide azalan saða yaslý
		while(counter!=0) {
			for(i=0;i<number-counter;i++) {
				System.out.print(" ");
			}
			for(i=counter;i!=0;i--) {
				System.out.print("*");
			}
			System.out.print("\n");
			counter--;
		}
		//Aþaðýdaki git gide artan saða yaslý
		counter = 0;
		while(counter<=number) {
			for(i =number;i>counter;i--) {
				System.out.print(" ");
			}
			for(i=0;i<counter;i++) {
				System.out.print("*");
			}
			System.out.print("\n");
			counter++;
		}
}
}
