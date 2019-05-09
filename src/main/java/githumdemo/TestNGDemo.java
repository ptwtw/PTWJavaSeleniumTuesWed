package githumdemo;

import java.util.Scanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo 

{
	static int Num1= 0;
	static int Num2= 0;
	
	@BeforeTest 
	public void GetInput()
	{
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter your first Number?\n");
		Num1 = myScan.nextInt();
		
		System.out.println("Enter your second Number?\n");
		Num2 = myScan.nextInt();
		System.out.println("---------------------------\n");
		
		System.out.println("Enter your second Number?\n");
		Num2 = myScan.nextInt();
	
	}
	
	
	
	@Test(priority = 1)
	public void Addition()
	{
		int c;
		
		c = Num1 + Num2;
		
		System.out.println("Total is " + c);
		System.out.println("---------------------------\n");
				
	}
	
	
	@Test(priority = 2)
	public void Subtraction()
	{
		int c;
		
		c = Num1 - Num2;
		
		System.out.println("Difference is " + c);
		System.out.println("---------------------------\n");
				
	}
	
	@AfterTest
	public void Footer()
	{
		System.out.println("Thank you!");
		System.out.println("---------------------------\n");
	}
	
}
