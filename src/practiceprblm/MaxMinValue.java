package practiceprblm;

import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,max,min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a,b");
		a= sc.nextInt();    
		b= sc.nextInt();     //num= 235
		c= a+b;
		int one =  a+b*c;
		int two = c+a/b;
		int three = a%b+c;
		int four = a*b+c;
		max = a;
		if (two > max) {
			max = two;
		}
		if (two > max) {
			max = two;
		}
		if (three > max) {
			max = three;
		}
		if (four > max) {
			max = four;
		}
		min = a;
		if (two < min) {
			min = two;
		}
		if (two < min) {
			min = two;
		}
		if (three < min) {
			min = three;
		}
		if (four < min) {
			min = four;
		}
		System.out.println("The Max and Min Values are Max = "+max+" Min = "+min);
	}

}
