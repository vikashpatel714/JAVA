
/*
 Program: /Ques3:Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
 Author: VIKASH PATEL
 date: 29-09-2022
 */
import java.util.Scanner;
public class Calculation
{
    public static void main(String[] args) 
    {
        int m, n, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        m = s.nextInt();
        System.out.print("Enter second number:");
        n = s.nextInt();
        while(true)
        {
            System.out.println("if user press1 for addition");
            System.out.println("if user press 2 for subtraction");
            System.out.println("if user press 3 for multiplication");
            System.out.println("if user press 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = s.nextInt();
           
            switch(opt)
            {
                case 1:
                add = m + n;
                System.out.println("Result:"+add);
                break;
 
                case 2:
                sub = m - n;
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = m * n;
                System.out.println("Result:"+mul);
                break;
 
                case 4:
                div = (double)m / n;
                System.out.println("Result:"+div);
                break;    
 
                case 5:
                System.exit(0);
            }
        }
    }
}
//output
// Enter first number:5
// Enter second number:8
// if user press1 for addition
// if user press 2 for subtraction
// if user press 3 for multiplication
// if user press 4 for division
// Enter 5 to Exit

// 1
// Result:13
// if user press1 for addition
// if user press 2 for subtraction
// if user press 3 for multiplication
// if user press 4 for division
// Enter 5 to Exit
// 2
// Result:-3
// if user press1 for addition
// if user press 2 for subtraction
// if user press 3 for multiplication
// if user press 4 for division
// Enter 5 to Exit
// 3
// Result:40
// if user press1 for addition
// if user press 2 for subtraction
// if user press 3 for multiplication
// if user press 4 for division
// Enter 5 to Exit
// 4
// Result:0.625
// if user press1 for addition
// if user press 2 for subtraction
// if user press 3 for multiplication
// if user press 4 for division
// Enter 5 to Exit
// 5

