public class A {
    public static void main(String[] args)
    {//creating scanner object to take input from user
        //scanner is a class input from the class
        Scanner sc = new Scanner(System.in);

        //system.in mean take input value from user
        System.out.println("Enter first number");
        int num1=sc.nextInt(); 
        System.out.println("Enter Second number");
        int num2=sc.nextInt(); 
        //writting operation
        int add , sub,mul,div,mod;
       add=num1+num2;
       sub=num1-num2;
       mul=num1*num2;
       div=num1/num2;
       mod=num1%num2;
       //getting result
       System.out.println("addition is : = " + add);
       System.out.println("multilpication is : = " + mul);
       System.out.println("division is : = " + div);
       System.out.println("moduluous is : = " + mod); 
    }
}