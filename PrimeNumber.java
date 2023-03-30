package day6;
//wap to check prime or not 
//if number is prime if it is divisible by 1 and itself 

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n=2;
		int flag=0;
		for( int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{   flag=1;
				System.out.println(" not prime");
			    break;
			}
		  }
				 
				if(flag==0)
		  
			System.out.println("its prime number");

	}}

 
