import java.util.Scanner;
class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of element in Array: ");
		int n=sc.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
// 1) WAJP Print element in array which is divisible by 5 
		System.out.print("divisible by 5: ");
		for (int i=0;i<n;i++ ) {
			if(arr[i]%5==0){
			System.out.print(arr[i]+" ");}
		}
// 2)WAJP Print even index element in an array?
		System.out.println();
		System.out.print("even index element: ");
		for (int i=0;i<n;i++ ) {
			if(i%2==0){
			System.out.print(arr[i]+" ");}
		}
// 3)WAJP Print even element in an array?
        System.out.println();
		System.out.print("even  element ");
		for (int i=0;i<n;i++ ) {
			if(arr[i]%2==0){
			System.out.print(arr[i]+" ");}
		}
// 4)WAJP Print odd index element in an array?
		System.out.println();
		System.out.print("odd index element: ");
        for(int i=0;i<n;i++){
        	if(i%2!=0){
        		System.out.print(arr[i]+" ");
        	}
}


// 5)WAJP Print odd element in an array?
         System.out.println();
         System.out.print("odd Element: ");
         for(int i=0;i<n;i++){
         	if(arr[i]%2!=0){
         		System.out.print(arr[i]+" ");
         	}
         }
// WAJP Print positive even element in an array?

         System.out.println();
         System.out.print("positive even element: ");
         for(int i=0;i<n;i++){
         	if(arr[i]>0 && arr[i]%2==0){
         		System.out.print(arr[i]+" ");
         	}

         }

 // 7)WAJP Print First Element and last element?

         System.out.println();
         System.out.print("First Element and last element: ");
         for(int i=0;i<n;i++){
         	if(i==0 ||i==n-1){
         		System.out.print(arr[i]+" ");
         	}
         }
         
// 8)WAJP Find Sum of array elements?
         System.out.println();
         
         int sum=0;
         for(int i=0;i<n;i++){
         	sum+=arr[i];
         }
         System.out.println("Sum of Array: "+sum);
// 9)WAJP Find Sum of even element in an array?
         
         int sum1=0;
         for(int i=0;i<n;i++){
           if(arr[i]%2==0){
           	sum1+=arr[i];
           }
         }
         System.out.println("Sum of even element in an array: "+sum1);

// 10)WAJP Find Sum of Odd element in an array?
         int sum2=0;
         for(int i=0;i<n;i++){
           if(arr[i]%2!=0){
           	sum2+=arr[i];
           }
         }
          System.out.println("Sum of odd element in an array: "+sum2);


// 11)WAJP Find Average of an array?
          int avg;
          int sum3=0;
          for (int i=0;i<n ;i++ ) {
          	   sum3+=arr[i];
          }
          avg=sum3/n; 
     
         System.out.println("Average of an array: "+avg);
// 12)WAJP Find Average of even element in an array?
         int avg1;
         int sum4=0;
         int c=0;
         for(int i=0;i<n;i++){
         	if(arr[i]%2==0){
         		sum4+=arr[i];
         		c++;
         	}
         }
         avg1=sum4/c;
         System.out.println("Average of even element in an array: "+avg1);

// 13)WAJP Find difference of Even sum and Odd sum?
         int evenSum=0;
         int oddSum=0;
         for (int i=0;i<n ;i++ ) {
         	if(arr[i]%2==0){
         		evenSum+=arr[i];
         	}
         	else{
         		oddSum+=arr[i];
         	}
         }
         int diff=evenSum-oddSum;
         System.out.println("difference of Even sum and Odd sum: "+diff);
        
// 14)WAJP Print Armstrong element in an array
         for (int i=0;i<n ;i++ ) {
         	
         }

 


	}
}