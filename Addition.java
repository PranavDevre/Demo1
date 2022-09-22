import java.util.*;
public class Addition {
	
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter the Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int d=a+b+c;  //Average 
		
		System.out.println("The Average of A and B:"+d/3);
		
	}
}
