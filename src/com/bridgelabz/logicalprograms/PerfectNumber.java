package com.bridgelabz.logicalprograms;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		//Variables
		int numberToCheck=28;
		int sumOfFactors=0;
		if(numberToCheck>0)
		{
			for(int index=1;index<numberToCheck;index++)
			 {
				 if(numberToCheck%index==0)
				 {
					 sumOfFactors+=index;
				 }
			 }
			if(sumOfFactors==numberToCheck)
			{
				System.out.println("Given number "+numberToCheck+" is a perfect number");
			}
			else
			{
				System.out.println("Given number "+numberToCheck+" is not a perfect number");
			}
			
		}
		else
		{
			System.err.println("Number is not positive");
		}

	}

}
