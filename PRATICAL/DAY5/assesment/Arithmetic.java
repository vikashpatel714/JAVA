//Que1)Arithemic operation with three variables(Take the input from the user)

public class Arithmetic {

	public static void main(String[] args) {
		// creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		//getting  input  value from user 
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
         //writting operaction
		int add;
		add=num1+num2+num3;
		//getting result
		System.out.println("Addition is :"+ add);

	}
}