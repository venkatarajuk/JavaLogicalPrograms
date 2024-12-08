package javalogicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();


        int reversed = reverseNumber(number);

       
        System.out.println("Reversed number: " + reversed);

        scanner.close(); 
    }


    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;         
            reversed = reversed * 10 + digit; 
            number /= 10;
        }

        return reversed;
    }
}
