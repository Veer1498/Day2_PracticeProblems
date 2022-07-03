package practiceprblm;

import java.util.Scanner;

public class IfElse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for getting Word");
		a = sc.nextInt();
		if (a==1) {
			System.out.println("ONE");
		}
		else if (a==10) {
			System.out.println("TWO");
		}
		else if (a==100) {
			System.out.println("THREE");
		}
		else if (a==1000) {
			System.out.println("FOUR");
		}

	}

}
