import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Type:");
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		if(isArm(n)) {
			System.out.println("isArm() is true hence, yes");
		}
		else {
			System.out.println("isArm() is false hence, no");
		}
	}
	
	
	
	
	
	public static boolean isArm(int n) {
		System.out.println("Entered isArm()");
		System.out.println("Number passed to isArm() is "+n);
		int c=0;
		int p=countn(n);
		int sum=0,a=n,d,m=1;
		System.out.println("value of m before while loop: "+m);//written for testing
		while(a!=0) {
			d=a%10;
			System.out.println("Digit passed to for loop: "+d);
			for(int i=1;i<=p;i++) {
				m=m*d;
				c++;
				System.out.println("For loop ran "+c+" times");
				
			}
			System.out.println("value of m after for loop: "+m);//written for testing
			sum+=m;
			c=0;//for testing
			m=1;
			
			System.out.println("value of sum:"+sum);
			a=a/10;
			
		}
		System.out.println("isArm returns "+(sum==n));//written for testing
		System.out.println("Exited isArm()");
		return n==sum;
		
	}
	
	
	
	
	
	
	public static int countn(int n) {
		System.out.println("Entered count()");
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		System.out.println("The number of digits in the number is "+c);//written for testing
		System.out.println("Exited count()");
		return c;
	}
		
}
