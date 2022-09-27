//Que2)relation  operation with three variables(Take the input from the user)
public class Relational {

	public static void main(String[] args) {
		//creating Scanner class to take input from user
				Scanner sc=new Scanner(System.in);
				
				//getting input value from user 
			  System.out.println("Enter the first value: ");
				int num1=sc.nextInt();
				
				System.out.println("Enter the second value: ");
				int num2=sc.nextInt();
				
				System.out.println("Enter third number:");
				int num3=sc.nextInt();
				
				// performing Equal to operation 
				System.out.println(" num1==num2==num3 : " + (num1==num2)+ " "+(num1==num3));
				//performing is not equal to operation 
				System.out.println(" num1!=num2!=num3 : " + (num1!=num2) +" " + (num1!=num3));
			 
    }		
}
