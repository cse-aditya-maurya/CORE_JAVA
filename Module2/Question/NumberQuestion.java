/*WAP: to display square,cube,squareroot ,and cuberoot of the given int type number

*/
import java.util.Scanner;
class NumberQuestion {
	  public static int square(int n){
            return n*n;
	  }
	  public static int cube(int n){
	  	  return n*n*n;
	  }
	  public static int squareroot(int n){
             int start=0;
             int end=n;
             int ans=0;
             while(start<=end){
               int mid=start+(end-start)/2;

               if(mid*mid==n ) return mid;
                if(mid*mid<n) {
                	start=mid+1;
                	ans=mid;
                }  
                else{
                	end=mid-1;
                }
                // return ans;
             }
             return ans;
 
	  }
	  public static int cuberoot(int n ){
           int start=0;
             int end=n;
             int ans=0;
             while(start<=end){
               int mid=start+(end-start)/2;

               if(mid*mid*mid==n ) return mid;
                if(mid*mid*mid<n) {
                	start=mid+1;
                	ans=mid;
                }  
                else{
                	end=mid-1;
                }
                // return ans;
             }
             return ans;
	  }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();

		System.out.println(square(n));
		System.out.println(cube(n));
		System.out.println(squareroot(n));
		System.out.println(cuberoot(n));


	}
}