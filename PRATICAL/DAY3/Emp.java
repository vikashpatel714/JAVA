class Employee
{
  String name,hike;
  public Employee(String n,String d)
   {
     name=n;
     hike=d;
   }
  public void EmpDisp()
   {
    System.out.println("Employee Name:"+name+"\nhike:"+hike);
   }
}
class EmployeeSalary extends Employee
{
  double salary;
  public EmployeeSalary(String n,String d,double s)
   {
     super(n,d);
     salary=s;
   }
  public void EmpDisp()
   {
    super.EmpDisp();
    System.out.print("Salary:"+salary);
   }
}
class Emp
{
 public static void main(String [] args)
  {
    EmployeeSalary Emp1=new EmployeeSalary("vikash","0.35",600000);
    Emp1.EmpDisp();
  }
}
