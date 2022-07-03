package practiceprblm;

import java.util.Scanner;

public class ReverseNumbForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Sum");
		num= sc.nextInt();     //num= 235
		for(int i=1;i<=num;i++) {
			 rem=num%10;       //rev = 5
			rev= rev*10+rem;   //rev =5 
			num = num/10;     //num = 23;
		}
		System.out.println("Reversed Number is "+rev);

	}

}
