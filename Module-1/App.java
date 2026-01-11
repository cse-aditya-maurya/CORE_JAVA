import java.util.Scanner;
class App{
	public static void Calculate(){
		boolean condition=true;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("\nCALCULATOR APPLICATION\nEnter your choice\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit\n");
			int choice=sc.nextInt();
		switch(choice){
			case 1:{
				System.out.print("Enter the first Integer type Value ");
				int a=sc.nextInt();
				System.out.print("Enter the second Integer type Value ");
				int b=sc.nextInt();
				System.out.println("Addition is "+Arithmetic.add(a,b));break;}
			case 2:{
				System.out.print("Enter the first Integer type Value ");
				int a=sc.nextInt();
				System.out.print("Enter the second Integer type Value ");
				int b=sc.nextInt();
				System.out.println("Substraction is "+Arithmetic.sub(a,b));break;}
			case 3:{
				System.out.print("Enter the first Integer type Value ");
				int a=sc.nextInt();
				System.out.print("Enter the second Integer type Value ");
				int b=sc.nextInt();
				System.out.println("Multiplication is "+Arithmetic.mul(a,b));break;}
			case 4:{
				System.out.print("Enter the first Integer type Value ");
				int a=sc.nextInt();
				System.out.print("Enter the second Integer type Value ");
				int b=sc.nextInt();
				System.out.println("Division is "+Arithmetic.div(a,b));break;}
			case 5:{
				System.out.print("Enter the first Integer type Value ");
				int a=sc.nextInt();
				System.out.print("Enter the second Integer type Value ");
				int b=sc.nextInt();
				System.out.println("Modulus is "+Arithmetic.mod(a,b));break;}
			case 6:{
				System.out.println(".....................................................Exiting");
				condition=false;break;}
			default:{System.out.println("Invalid Choice");break;}}
		}while(condition);
	}
}