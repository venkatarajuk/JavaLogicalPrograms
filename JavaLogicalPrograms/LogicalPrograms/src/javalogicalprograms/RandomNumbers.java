package javalogicalprograms;

public class RandomNumbers {
	public static void main(String[] args) {
       
        int randomNumber = 1000 + (int)(Math.random() * 9000); 
        System.out.println("Random 4-digit number: " + randomNumber);
    }
}
