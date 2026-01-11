import java.util.Scanner;
class FunWithNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int securedData=num;
		int data=num;
		int count=0;
		int j=0;
		int evenSum=0;
		int oddSum=0;
		int evenCount=0;
		int oddCount=0;
		int digitSum=0;
		int digitProduct=1;
		while(num>0){
			int temp=num%10;
			num/=10;
			count++;
		}
		int arr[]=new int[count];
		while(data>0){
			int temp=data%10;
			arr[j]=temp;
			data/=10;
			j++;
		}
		for(int i=0;i<arr.length;i++){
			digitSum+=arr[i];
			digitProduct*=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evenCount++;
				evenSum+=arr[i];
			}
			else{
				oddCount++;
				oddSum+=arr[i];
			}
		}
		if(digitSum==count){
			System.out.println("Its an autobiographical number");
		}
		if(digitSum==digitProduct){
			System.out.println("Its a spy number");
		}
		if(evenCount==oddCount){
			System.out.println("Its a beautiful number");
		}
		if(evenSum==oddSum){
			System.out.println("Its a super number");
		}
	}
}