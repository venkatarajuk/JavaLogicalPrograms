package javalogicalprograms;

import java.util.Scanner;

public class AmstrongOrNot {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number : ");
	        int number = scanner.nextInt();

	       
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close(); 
	    }

	   
	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int numberOfDigits = String.valueOf(number).length(); 

	     
	        while (number != 0) {
	            int digit = number % 10;                      
	            result += Math.pow(digit, numberOfDigits);    
	            number /= 10;                                
	        }

	        
	        return originalNumber == result;
	    }
}
