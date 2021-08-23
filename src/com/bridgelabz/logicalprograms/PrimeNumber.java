package com.bridgelabz.logicalprograms;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int numberToCheckPrime=7;
		boolean isPrimeNumber=false;
		
		if(numberToCheckPrime>1)
		{
			for(int index=2;index<numberToCheckPrime;index++)
			{
				if(numberToCheckPrime%index==0)
				{
					isPrimeNumber=false;
					break;
				}
				else
				{
					isPrimeNumber=true;
				}
			}
		}
		
		if(isPrimeNumber==true) 
		{
			System.out.println("Given number is prime");
			
		}
		else
		{
			System.out.println("Given number is not prime");
		}
		
		

	}

}
