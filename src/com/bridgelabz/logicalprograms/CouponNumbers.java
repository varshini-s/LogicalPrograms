package com.bridgelabz.logicalprograms;

import java.util.HashSet;

public class CouponNumbers 
{
	public static HashSet<Integer> set=new HashSet<>();
	
	public static int getRandomNumber()
	{
		//to return random numbers between 0 to 9
		return (int)Math.floor(Math.random()*10)%9;
	}
	public static boolean processDistinctCoupons(int randomNumber)
	{
		boolean isUnique=false;
		  //to check if number is unique
		  if(set.contains(randomNumber)==false)
          {
			  set.add(randomNumber);
			  isUnique=true;
			  
          }
		  
		return isUnique;
	}

	public static void main(String[] args) 
	{
		int nValue=5;
		int couponCode[]=new int[nValue];
		boolean isCodeUnique;
		int countCode=0,countRandomNumbers=0;
		
		while(countCode<nValue)
		{
			countRandomNumbers++;
			int randomNumber=getRandomNumber();
			isCodeUnique=processDistinctCoupons(randomNumber);
			if(isCodeUnique==true)
			{	
				couponCode[countCode]=randomNumber;
				countCode++;
				
			}
			
			
		}
		System.out.print("Unique coupon code is: ");
		for(int index=0;index<nValue;index++)
		{
			System.out.print(couponCode[index]);
		}
		System.out.println("\nNumber of random numbers Taken is :"+countRandomNumbers);
	
	}

}
