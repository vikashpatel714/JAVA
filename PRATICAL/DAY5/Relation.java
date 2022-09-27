public class Relation{
    public static void main(String[] args)
    {
        //creating scanner class to take input from user
        Scanner sc=new Scanner(System.in);
        //getting input value from user
        System.out.println("enter the first value:");
        int num1=sc.nextInt();
        System.out.println("enter the second value:");
        int num2=sc.nextInt();
        System.out.println("enter the third value:");
        int num3=sc.nextInt();
       //performing equal to operation 
       
       System.out.println("num1==num2" +(num1=num2=num3));
       //performing is not eual to operation
  
    }
}