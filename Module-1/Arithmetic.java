import java.util.Scanner;
class Arithmetic{
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}
	public static int mod(int a,int b){
		return a%b;
	}
	public static void printDivisors(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		for(int i=num;i>0;i--){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
	public static void perfectTypeChecker(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		if(sum==num){
			System.out.println("Perfect Number");
		}
		else if(sum>num){
			System.out.println("Abundant Number");
		}
		else if(sum<num){
			System.out.println("Deficient Number");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
	public static void specialChecker(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int data=num;
		int sum=0;
		int product=1;
		while(data!=0){
			int temp=data%10;
			sum+=temp;
			product*=temp;
			data/=10;
		}
		if(sum+product==num){
			System.out.println("ITS A SPECIAL NUMBER");
		}else{
			System.out.println("NOT SO SPECIAL");
		}
	}
	public static void HarshadAndNeon(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int data=num;
		int harshadSum=0;
		int neonSum=0;
		while(data!=0){
			int temp=data%10;
			harshadSum+=temp;
			data/=10;
		}
		data=num*num;
		while(data!=0){
			int temp=data%10;
			neonSum+=temp;
			data/=10;
		}
		if(num>0&&neonSum==num){
			System.out.println("Neon Number");
		}
		else if(num>0&&num%harshadSum==0){
			System.out.println("HARSHAD NUMBER");
		}
		else{
			System.out.println("NEITHER HARSHAD NOR NEON");
		}
	}
	public static void PrimeAndFactorial(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int factorCount=0;
		int factorial=1;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				factorCount++;
			}
		}
		if(factorCount==2){
			System.out.println("Prime");
		}
		else{
			System.out.println("Composite");
		}
		for(int i=num;i>0;i--){
			factorial*=i;
		}
		System.out.println("Factorial is "+factorial);
	}
	public static int factorial(int num){
		int factorial=1;
		if(num==0){return 1;}
		for(int i=num;i>0;i--){
			factorial*=i;
		}
		return factorial;
	}
	public static void ArmStrong(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int data=num;
		int cubeSum=0;
		int factorialSum=0;
		while(data!=0){
			int temp=data%10;
			cubeSum+=temp*temp*temp;
			data/=10;
		}
		data=num;
		while(data!=0){
			int temp=data%10;
			factorialSum+=factorial(temp);
			data/=10;
		}
		if(cubeSum==num){
			System.out.println("ARMSTRONG NUMBER");
		}
		if(factorialSum==num){
			System.out.println("STRONG NUMBER");
		}
	}
	public static void palindrome(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int data=num;
		int reverse=0;
		int count=0;
		while(data!=0){
			int temp=data%10;
			reverse*=10;
			reverse+=temp;
			data/=10;
		}
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(reverse==num&&count==2){
			System.out.println("ITS A Prime Palindrome NUMBER");
		}
		else if(reverse==num&&count!=2){
			System.out.println("ITS Not Prime but a Palindrome NUMBER");
		}
		else if(reverse!=num&&count==2){
			System.out.println("ITS A Prime NUMBER but not palindrome");
		}
		else{
			System.out.println("Neither a prime nor A Palindrome");
		}
	}
	public static void ramanujan() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int data=num;
		int sum=0;
		int reverse=0;
		while(data!=0){
			int temp=data%10;
			sum+=temp;
			data/=10;
		}
		data=sum;
		while(data!=0){
			int temp=data%10;
			reverse*=10;
			reverse+=temp;
			data/=10;
		}
		if(reverse*sum==num){System.out.println("RAMANUJAN NUMBER");}
		else{
			System.out.println("Not a RAMANUJAN NUMBER");
		}
	}
	public static void disarium() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int data=num;
		int count=0;
		int sum=0;
		while(data!=0){
			int temp=data%10;
			data/=10;
			count++;
		}
		data=num;
		while(data!=0){
			int temp=data%10;
			sum+=Math.pow(temp,count);
			data/=10;
			count--;
		}
		if(sum==num){System.out.println("Disarium NUMBER");}
		else{
			System.out.println("Not a Disarium NUMBER");
		}
	}
}