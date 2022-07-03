package practiceprblm;
import java.util.*;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner =new Scanner(System.in);
		  System.out.println("Enter the value of X: ");// 2
	        Double x =scanner.nextDouble();

	        System.out.println("Enter the value of Y: ");//11
	        Double y =scanner.nextDouble();
	        
	        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	        		System.out.println("The Distance from originis "+distance);
	}

}
