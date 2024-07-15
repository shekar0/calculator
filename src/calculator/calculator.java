package calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("enter the your choice :");
		display();
		
		
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			c=a+b;
			System.out.println("the addition of "+a+ " and "+b+" is :"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("the subtraction of "+a+ " and "+b+" is :"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("the multiplication of "+a+ " and "+b+" is :"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("the divison of "+a+ " and "+b+" is :"+c);
			break;
		case 5:
			c=a %b;
			System.out.println("the modulus of "+a+ " and "+b+" is :"+c);
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("enter valid option ");
			break;
		}
		sc.close();
		

	}

	private static void display() {
		System.out.println("***********************");
		System.out.println("1.addition ");
		System.out.println("2.subtraction ");
		System.out.println("3.multiplication ");
		System.out.println("4.divison ");
		System.out.println("5.modulus ");
		System.out.println("6.exit ");
		System.out.println("*************************");
		
	}
	
}
