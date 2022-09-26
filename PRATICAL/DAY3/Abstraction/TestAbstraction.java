//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors
// and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.

//Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.
abstract class Shape{  
    abstract void draw();  
    }  
    // implementation is provided by others i.e. unknown by end user  
    class Rectangle extends Shape{  
    void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle1 extends Shape{  
    void draw(){System.out.println("drawing circle");}  
    }  
    // method is called by programmer or user  
    class TestAbstraction{  
    public static void main(String args[]){  
    Shape s=new Circle1();// object is provided through method, e.g., getShape() method  
    s.draw();  
    }  
    }  

   // output-
   //drawing circle
