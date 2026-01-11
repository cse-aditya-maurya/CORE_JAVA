//write a java program to design and develop the java application to achieve the business logic implementation of as follows:
//1. Number verifier system
//2. Character verifier system

import java.util.Scanner;
class Questions{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// if(n>0&&n%2==0){
		// 	System.out.print("Positive and Even");
		// }
		// else if(n>0&&n%2!=0){
		// 	System.out.print("Positive and Odd");
		// }
		// else if(n<0&&n%2==0){
		// 	System.out.print("Negative and Even");
		// }
		// else if(n<0&&n%2!=0){
		// 	System.out.print("Negative and Odd");
		// }
		// else{
		// 	System.out.print("0/neutral number");
		// }
		char ch=' ';
		if(Character.isDigit(ch)){System.out.println("Digit");}
		else if(Character.isUpperCase(ch)){System.out.println("UPPERCASE");}
		else if(Character.isLowerCase(ch)){System.out.println("lowercase");}
		else{System.out.println("Symbol");}
	}
}
