package com.bridgelabz.logicalprograms;

import java.util.Scanner;


public class SimulateStopwatchProgram 
{
	

	public static void main(String[] args)
	{
		System.out.println("Press 1 to start the stopwatch" );
		
		Scanner scanner = new Scanner(System.in); 
		int input=scanner.nextInt();
		long startTime=0,stopTime = 0;
		
		if(input==1)
		{
			 startTime = System.currentTimeMillis();
		}
		else
		{
			System.err.println("Wrong input to start the timer");
		}
		System.out.println("Press 2 to stop the stopwatch ");
		input=scanner.nextInt();
		
		if(input==2)
		{
			 stopTime = System.currentTimeMillis();
		}
		else
		{
			System.err.println("Wrong input to stop the timer");
		}
		
		long timeElapsed = stopTime-startTime;
		System.out.println("Time elapsed in millisecond is :"+timeElapsed);
		

	}

}
