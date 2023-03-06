package controlstatements;
/*Program-42

Define a method which returns Collatz sequence for a give input value.
Write the method with the following specifications: 
Name of method: getCollatzSequence(int num) // which accepts an integer value as argument and return a string.
Arguments: one argument of type integer
Return Type: string
Specifications: The value returned by the method getCollatzSequence() is determined by the following rules:
If the given value is 5, return a string of Collatz Sequence as 5 16 8 4 2 1
If the given value is negative, return "Error"
Note:
At each stage you must add the numbers to the output string and form the output as shown above. 
The numbers in the output string must be separated by a space as shown above. 
The output must include the given number and 1.
If the number does not converge to 1 in 100 tries the return the String Does not Converge.
*/
import java.util.Scanner;

public class Pr42CollatzSeq 
{
	public String getCollatzSequence(int num)
	{
		String s=""; int c=0;
		int temp;temp=num;
		while(temp!=1)
		{
			s=s+temp+" ";
			if(temp%2==0) temp=temp/2;
			else temp=3*temp+1;
			c++;
			//if(c>100 && temp>1) {s="does not Converge"; break;} //try 1002543
		}
		if(temp==1) s=s+temp;
		return s;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		Pr42CollatzSeq obj=new Pr42CollatzSeq();
		String s=obj.getCollatzSequence(n);
		System.out.println("Collatz sequence "+s);
		sc.close();
	}
}
