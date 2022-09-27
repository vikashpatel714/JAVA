public class RelationalOperator{
    public static void main(String[] args)
    {
        //creating scanner class to take input from user
        Scanner sc=new Scanner(System.in);
        //getting input value from user
        System.out.println("enter the first value:");
        int num1=sc.nextInt();
        System.out.println("enter the second value:");
        int num2=sc.nextInt();
       //performing equal to operation 
       System.out.println("num1==num2" +(num1=num2));
       //performing is not eual to operation
       System.out.println("num1!=num2" +(num1!=num2));

       System.out.println("num1>num2" +(num1>num2));

       System.out.println("num1<num2" +(num1<num2));

       System.out.println("num1>=num2" +(num1>=num2));

       System.out.println("num1<=num2" +(num1<=num2));
    }
}