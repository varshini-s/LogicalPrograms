package com.bridgelabz.logicalprograms;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		//variables
		int number=123;
		int reverseOfNumber=0,remainder=0;
		
		while(number!=0)
		{
			remainder=number%10;
			reverseOfNumber = reverseOfNumber * 10 + remainder;  
			number = number/10;  
			
		}
		System.out.println("The reverse of the given number is: " + reverseOfNumber);  

		

	}

}
