/*Ques-1 A multilevel inheritance program.
 program: creating a class having methods  inherited by another class having 
 its own methods and  all the methods of both the class get called in main  function 
 Author:Vikash Patel
 date:29/09/2022
 */
  class Parent
	{   
		//creating a default Constructor 
		 Parent()
		 { 
			System.out.println("Hi");
		 }
		   public void sing()
		 { 
			 System.out.println("HUM SAFAR"); 
		 }
	}
 //class Child inheriting class Parent 
class Child extends Parent
{  
     public void speak()
	 {
		 System.out.println("good morning");
	 }
	public void dance()
	 {
		 System.out.println("TREDISANAL");
	 }
}

class T extends Child{
    public static void main(String[] args)
	{  
        //creating the object of Child class in main class 
		Child a= new Child();
		//calling the methods of sub-class in main class using object 
		a.sing();
		a.speak();
		a.dance();
	}
}
// //OUTPUT
// Hi! 
// hum safar
// good morning
// TREDISANAL