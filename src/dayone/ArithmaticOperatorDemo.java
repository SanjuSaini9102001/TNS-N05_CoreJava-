package dayone;

import java.util.Scanner;

public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 no:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Subtraction is: "+(num1-num2));
		System.out.println("Multiplication is: "+(num1*num2));
		System.out.println("Division is: "+(num1/num2));
		sc.close();
	}

}
