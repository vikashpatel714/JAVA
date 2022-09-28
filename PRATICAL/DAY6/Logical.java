// “AND”, “OR” and “NOT” operations
// AND Operator ( && ) – if( a && b ) [if true execute else don’t]
// OR Operator ( || ) – if( a || b) [if one of them is true execute else don’t]
// NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]

import java.util.Scanner;

public class LogicalUser {

	public static void main(String[] args) {
		// creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		//getting  input  value from user 
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		
		
		//using logical AND to Varify two constant
		 if ((a < b) && (b == c)) {
			  System.out.println("AND operation");
	           int d = a + b + c;
	         
	            System.out.println("The sum is: " + d);
		 }
		 else { 
			 System.out.println("False conditions");
		 }


		
//		//using logical OR to Varify two constant
		 if ((a < b) || (b == c)) {
	           int d = a + b + c;
	           System.out.println("OR operation");
	            System.out.println("The sum is: " + d);
		 }
		 else { 
			 System.out.println("False conditions");
		 }


	
	
		//using logical NOT to Varify two constant
		System.out.println("NOT operation");
		 System.out.println("!(a < b) = " + !(a < b));
	        System.out.println("!(b > c) = " + !(b > c));
	
		 }
	}
    //OUTPUT
//     enter first number
// 6
// enter second number
// 8
// enter third number
// 9

// AND operation
// False conditions

// OR operation
// The sum is: 23

// NOT operation
// !(a < b) = false
// !(b > c) = true