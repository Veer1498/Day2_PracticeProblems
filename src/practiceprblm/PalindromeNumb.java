package practiceprblm;

import java.util.Scanner;

public class PalindromeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Sum");
		num= sc.nextInt();            //num= 235
		int temp =num;
		for(int i=1;i<=num;i++) {
			 rem=num%10;              //rev = 5
			rev= rev*10+rem;          //rev =5 
			num = num/10;             //num = 23;
		}
		if(temp==rev)
		System.out.println("This is a Palindrome Number");
		else
		System.out.println("This is Not Palindrome Number");

	}

}
