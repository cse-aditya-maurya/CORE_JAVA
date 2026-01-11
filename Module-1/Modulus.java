//write a java program to display all the digits from the given integer type number
class Modulus{
	public static void main(String[] args){
		int num=123456;
		int data=num;
		while(data>0){
			int temp=data%10;
			data/=10;
			System.out.println(temp);
		}
	}
}