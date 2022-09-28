import java.util.Scanner;
public class Assign {
	
		public static void main(String[] args) {
			// creating scanner object to take input from user
			Scanner sc = new Scanner(System.in);
			//getting  input  value from user 
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			//adding and assign value
			a += b;
			
			// Displaying the assigned values
			System.out.println("a = " + a);
			
			//subtracting and assigning value
			b += a;
			// Displaying the assigned values
						System.out.println("b = " + b);
						
			//multiplying and assining value
						b *= a;	
			System.out.println("b = " + b);	
			
			//Devide and assining value
			b /= a;	
            System.out.println("b = " + b);	
            
          //Moduluous and assining value
			b %= a;	
           System.out.println("b = " + b);	
		}
}
//enter first number
//8
//enter second number
//5
//a = 13
//b = 18
//b = 234
//b = 18
//b = 5