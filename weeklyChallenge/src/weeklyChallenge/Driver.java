package weeklyChallenge;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to test:");
		Scanner input=new Scanner(System.in);
		try {
		int n = input.nextInt();
		
		if(isHeteromecic(n)==true) {
			System.out.println(n + " is Heteromecic");
		}
		else {
			System.out.println(n + " is not Heteromecic");
		}
		if(isHappy(n)==true) {
			System.out.println(n + " is Happy");
		}
		else {
			System.out.println(n + " is not Happy");
		}

		}
		 	
		
		catch(InputMismatchException e) {
			System.out.println("invalid input");
		}
		
	}
	public static boolean isHeteromecic(int x) {
		for (int i = 0; i < x; i++) {
			if (i * (i + 1) == x) {
				return true;
			}
		}
		return false;
	}
	
	  public static boolean isHappy(int x)
	    {
	        Set<Integer> unique_x = new HashSet<Integer>();

	        while (unique_x.add(x))
	        {
	            int value = 0;
	            while (x > 0)
	            {
	                value += Math.pow(x % 10, 2);
	                x /= 10;
	            }
	            x = value;
	        }

	        return x == 1;
	    }
	   

}
