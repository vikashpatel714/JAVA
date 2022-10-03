/*  QUES-1 WAP to demonstrate nested if statement of 5 subjects.
the person who gets above 60% will be passed otherwise failed.
output should be like:Enter your name,Enter marks for the 5 subjects.
 Author: VIKASH PATEL
 date: 03-10-2022*/


 import java.util.Scanner;
 public class Pass {
 public static void main(String[] args) 
 { 	
 // Create an object of Scanner class to take input.
    Scanner sc = new Scanner(System.in);
    
   System.out.println("Enter the marks of Physics ");
    int phyMarks = sc.nextInt();
   System.out.println("Enter the marks of Chemistry ");
    int chemMarks = sc.nextInt();
   System.out.println("Enter the marks of Maths ");
    int mathsMarks = sc.nextInt();
  
 System.out.println("Enter the marks of English ");
  int engMarks = sc.nextInt();
 System.out.println("Enter the marks of Computer ");
  int compMarks = sc.nextInt();
  //CALCULATE THE TOTAL MARKS
 float totalMarks = phyMarks + chemMarks + mathsMarks + engMarks + compMarks;
 System.out.println("Total marks in five subjects: " +totalMarks);
 float myPer = totalMarks /5;
 System.out.println("My percentage: " +myPer);
 
 if(myPer >= 60) { // Checking percentage to find grade using if else statement.
  System.out.println("PASS");	
 }
 else {
   System.out.println("FAIL");	
 }
  }
 }

// OUTPUT
//  Enter the marks of Physics 
// 60
// Enter the marks of Chemistry 
// 45
// Enter the marks of Maths 
// 3
// Enter the marks of English 
// 80
// Enter the marks of Computer 
// 32
// Total marks in five subjects: 220.0
// My percentage: 44.0
// FAIL