/**
 * 
 */
package sdh.java.session3;

import java.util.Scanner;

/**
 * @author Sudhish TS
 *
 */
public class Assignment2 {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		int temp;
		boolean isPrime=true;
		System.out.println("Enter a number for check:");
		int num=in.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		if(isPrime)
		   System.out.println("The number " + num + " is a Prime Number");
		else
		   System.out.println("The number " + num + " is not a Prime Number");
	}
}