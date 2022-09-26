class Sum{
   //creating method sum(int,int) public int sum(int x, int y)  
 public int sum(int x, int y)
  { 
    return (x+y);
  }
//creating method sum(int) overloading sum 
public int sum(int x,int y,int z)
 {
     return (x+y+z);
} 
// creating method sum(double,double) overloading sum 
public double sum(double x,double y)
 {
     return (x+y);
     }

public static void main(String[] args)
 {
     Sum s1=new Sum();

System.out.println(s1.sum(7,3));//calling method sun(int, int) 
System.out.println(s1.sum(4,7,8)); //calling method sum(int, int, int) 
System.out.println(s1.sum(26,23.6)); //calling method sum(double, double)
}
}

//OUTPUT
// \" && javac Sum.java && java Sum
// 10
// 19
// 49.6