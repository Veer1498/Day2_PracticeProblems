package practiceprblm;

import java.util.Scanner;

public class NaturalNumbForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Sum");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("The Sum of Entered Natural Numbers is "+sum);

	}

}
