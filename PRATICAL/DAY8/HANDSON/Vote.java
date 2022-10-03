/* QUES-2 WAP to test whether the person is applicable to give vote usinf If-Else
 Author: VIKASH PATEL
 date: 03-10-2022*/
 import java.util.Scanner;
 public class Vote {
     public static void main(String[] args){
         int age;
         //Create an object of Scanner class to take input.
         Scanner input = new Scanner(System.in);
                         
         System.out.print("Please enter your age: ");
         age = input.nextInt();
                            
         if(age>=18){
             //// Checking percentage to find grade using if else statement.
             System.out.println("You have the right to vote.");
         }
         else{
             System.out.println(" you are not eligible to vote.");
         }
     }
 }
 //OUTPUT-
//  Please enter your age: 40
// You have the right to vote.
