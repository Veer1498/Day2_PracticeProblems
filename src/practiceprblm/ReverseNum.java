package practiceprblm;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Sum");
		num= sc.nextInt();     //num= 235
		while(num!=0) {
			 rem=num%10;       //rev = 5
			rev= rev*10+rem;    //num = 23;
			num = num/10;
		}
		System.out.println("Reversed Number is "+rev);

	}

}
