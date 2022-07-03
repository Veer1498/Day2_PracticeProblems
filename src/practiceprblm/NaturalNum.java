package practiceprblm;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i=1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Sum");
		num = sc.nextInt();
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("The Sum of Entered Natural Numbers is "+sum);

	}

}
