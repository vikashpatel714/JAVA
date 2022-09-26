
abstract class Car {
    // abstract method
    // it has no body
    abstract void m1();
 
    // concrete methods are still
    // allowed in abstract classes
    void m2()
    {
        System.out.println("car is gear change");
    }
}

// concrete class B
class B extends Car {
    // class B must override m1() method
    // otherwise, compile-time
    // exception will be thrown
    void m1()
    {
        System.out.println("drive safely");
    }
}
 
public class Tesla {
    public static void main(String args[])
    {
        //CALLING METHOD
        B b = new B();
        b.m1();
        b.m2();
    }
}
// //OUTPUT
// 4\" && javac Tesla.java && java Tesla
// drive safely
// car is gear change
