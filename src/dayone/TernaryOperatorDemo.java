package dayone;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the no:");
			int no=sc.nextInt();
			String res = (no%2==0)?"Even":"Odd";
			System.out.println(res);
		}

	}


