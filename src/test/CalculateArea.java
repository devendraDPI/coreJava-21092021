package test;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Area of Square
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side : ");
		num = scan.nextInt();
				
		int areasquare = num * num;
		
		System.out.println("Area of Square is "+ areasquare);

	}

}
