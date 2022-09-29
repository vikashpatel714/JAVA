/*
 Program: //Ques2. Create a program to find largest of two numbers.
 Author: VIKASH PATEL
 date: 29-09-2022
 */

import java.util.Scanner;
public class LargestNumber {

	   public static void main(String[] args)
	   {
	      int numberOne, numberTwo, largest;
	      Scanner a = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      numberOne = a.nextInt();
	      System.out.print("Enter the Second Number: ");
	      numberTwo = a.nextInt();
	      
	      if
	      (numberOne>numberTwo)
	         largest = numberOne;
	      
	      else {
	         largest = numberTwo;
	      }
	      System.out.println("\nLargest = " +largest);
	   }
	}
//output
//Enter the First Number: 30
//Enter the Second Number: 70
//Largest = 70
