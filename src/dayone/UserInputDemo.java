package dayone;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the integer value : ");
		int num = sc.nextInt();
		System.out.println("The value of num is: "+num);
		
		System.out.print("Enter the float value: ");
		float num1 = sc.nextFloat();
		System.out.println("The value of num1 is: "+num1);
		
		System.out.print("Enter the Character value: ");
		char ch = sc.next().charAt(0);
		System.out.println("The value of ch is: "+ch);
		
		System.out.print("Enter the String value: ");
		String str = sc.next();
		System.out.println("The value of str is: "+str);
	}

}
