import java.util.*;
public class Addition
{
	public static void main(String args[])
	{
		//ADDITION
		int x=15,y=10;
		int sum=x+y;
		System.out.println("Sum of " + x + " and " + y + " is ="+sum);  
		
		//MULTIPLICATION
		int prd=x*y;
		System.out.println("Product of " + x + " and " + y + " is ="+prd);

		//SUBSTRACTION	
		int sub=x-y;
		System.out.println("Difference of " + x + " and " + y + " is ="+sub);
		
		//DIVISION
		int d1=x/y;
		int d2=y/x;
		int d3=x%y;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);



		//EXPRESSION
		int exp=(x*y)/(x+y);
		System.out.println(exp);


		//EXPONENT/POWER
		int a=3,b=4;
		System.out.println(Math.pow(a,b));  		
		System.out.println((int)Math.pow(a,b));		//TYPECASTING
	}
}
