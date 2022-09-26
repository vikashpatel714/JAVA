//abstract classes cannot be instantiated, we can create subclasses from it. We can then access members of the abstract class using the object of the subclass.
//An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.
abstract class AbstractDemo{
//method of abstract class
public void display(){
    System.out.println("this is java class");
}
public class Testabstract extends AbstractDemo{
    public static void (String [] args){
        //creation obj of sub class;
        Testabstract t = new Testabstract();
        //access method of abstract class using object of sub class
        t.display();
    }
    }
}

