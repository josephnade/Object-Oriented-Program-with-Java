package Banking;
import java.util.Scanner;
public class Bank {
				public static int id() {
					int id = -2;
					while(true) {
					System.out.print("Please enter the ID(0-9)=");
					Scanner a = new Scanner(System.in);
					id = a.nextInt();
					if(id>=0 && id<=9) {
						break;
					}
					}
					return id;
				}
				public static void check(int[] account,int num) {
					System.out.println("Your balance="+account[num]+"\n");
				}
				public static void withdraw(int[] account,int num) {
					System.out.print("Please enter the amount to withdraw=");
					Scanner x=new Scanner(System.in);
					int	withdraw=x.nextInt();
					account[num]=account[num]-withdraw;
				}
				public static void deposit(int[] account,int num) {
					System.out.print("Please enter the amount to withdraw=");
					Scanner y=new Scanner(System.in);
					int	deposit=y.nextInt();
					account[num]=account[num]+deposit;
				}
				public static int menu() {
					System.out.print("Main Menu\n[1]Check Balance\n[2]Withdraw\n[3]Deposit\n[4]Exit\nPlease enter the number(1-4)=");
					Scanner scan = new Scanner(System.in);
					int number = scan.nextInt();
					return number;
				}
				public static void acc(int[]account) {
					for(int i = 0; i<account.length;i++) {
						account[i]=100;
					}
				}
				public static void main(String[] args) {
					int[] account= new int[10];
					acc(account);
					int id=id();
					while(true) {
					int number=menu();
					if(number==1) {
						check(account,id);
					}
					if(number==2) {
						withdraw(account,id);
					}
					if(number==3) {
						deposit(account,id);
					}
					if(number==4) {
						id=id();
					}
					}
				}
		}