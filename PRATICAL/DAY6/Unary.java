import java.util.Scanner;
//user input
public class Unary {
	
		public static void main(String[] args) {
			// creating scanner object to take input from user
			Scanner sc = new Scanner(System.in);
			//getting  input  value from user 
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			//unary operation
			a = -a;
//			
			// Displaying the assigned values
			System.out.println("a= " + a);
			
			
			++a;
			// Displaying the assigned values
						System.out.println("pre increament " + a);
						
						a++ ;
						// Displaying the assigned values
									System.out.println("post increament " + a);		
						 a--;	
			System.out.println("post decrement= " + a);	
			
			--a;	
            System.out.println("post decreement = " + a);	
            //output
            //enter first number
//            5
//            enter second number
//            6
//            a= -5
//            pre increament -4
//            post increament -3
//            post decrement= -4
//            post decreement = -5

     
		
			
			
//			//adding and assign value
//			a -= b;
//			
//			// Displaying the assigned values
//			System.out.println("a = " + a);
//			
//			//subtracting and assigning value
//			b -= a;
//			// Displaying the assigned values
//						System.out.println("b = " + b);
//						
//			//multiplying and assining value
//						b *= a;	
//			System.out.println("b = " + b);	
//			
//			//Devide and assining value
//			b /= a;	
//            System.out.println("b = " + b);	
//            
//          //Moduluous and assining value
//			b %= a;	
//           System.out.println("b = " + b);	
		}
}
//output
//enter first number
//4
//enter second number
//7
//a = -3
//b = 10
//b = -30
//b = 10
//b = 1
