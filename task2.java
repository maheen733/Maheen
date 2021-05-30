package scdlab12;
import java.util.Scanner;

	public class task2 
	{
		public static void main(String[] args) 
		{
			int num1, num2;
			Scanner sc = new Scanner(System.in);
			try 
			{
				System.out.println("Student 1  ");
				num1=sc.nextInt();
				
				System.out.println("Student 2 ");
					num2=sc.nextInt();
		
				System.out.println(num1+"/"+num2+"="+num1/num2);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Couldnot divide by zero");
			}
			catch(Exception e)
			{
				System.out.println("Enter integer as input");			
			}
		}
	}