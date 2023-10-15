package dayone;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter the weight: ");
		int weight = sc.nextInt();
		
		String res = (age>=18 && weight>=50)?"Eligible for blood donation":"Not eligible for blood donation";
		System.out.println(res);
	}

}
