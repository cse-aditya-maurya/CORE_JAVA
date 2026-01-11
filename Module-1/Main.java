/*WAP for:
	Number Displayer System
	Character Displayer System
	Basic Calculator
	//1. Number verifier system
	//2. Character verifier system
	//Display the divisors/factors for the given integer type number
	prime/composite checker
	Factorial
	check whether given number is palindrome
	/*AUTOBIOGRAPHICAL NUMBER: digit count==digit sum;............. 2020 (4==4)
	SPY NUMBER: digit sum==digit product;............... 123 (6==6)
	BEAUTIFUL NUMBER: even digit count==odd digit count;............1234 (2even,2odd)
	SUPER NUMBER: Even digit sum==odd digit sum; .........1254(6==6)
	Check whether num is: deficient-> divisors sum except number < number 
	perfect->  divisors sum except number == number eg .........6->1+2+3 
	abundant-> divisors sum except number > number							
	Special->  sum of digits+product of digits=number 
	Harshad Number-> 12->1+2=3 12%3==0 .......12 is Harshad Number for all num>0
	Neon Number-> 9->9^2=81 8+1=9......... 
	Strong Number->145->1cube+4cube+5cube==num
	Armstrong NUmber->153->1cube+2cube+3cube==num
	Ramanujan Number-> 1729-> 1+7+2+9=19->rev(19)->91->91*19=1729
	Disarium Number-> 
*/
class Main{
	public static void main(String[] args){
		// App.Calculate();
		// Arithmetic.printDivisors();
		// Arithmetic.perfectTypeChecker();
		// Arithmetic.specialChecker();
		// Arithmetic.HarshadAndNeon();
		// Arithmetic.PrimeAndFactorial();
		// Arithmetic.ArmStrong();
		// NumberDisplayer.seriesChar('z','Z');
		// Arithmetic.palindrome();
		// Arithmetic.ramanujan();
		Arithmetic.disarium();

		


	}
}