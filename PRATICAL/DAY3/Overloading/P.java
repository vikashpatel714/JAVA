//If a class has multiple methods having same name but different in parameters.
// it is known as Method Overloading.
class Multiply {

    void mul(int a, int b) {
        //creating the area method two number
        System.out.println("Multiply of two=" + (a * b));
    }

    void mul(int a, int b, int c) {
        //creating the area method three number
        System.out.println("Multiply of three=" + (a * b * c));
    }
}
public class P {
//calling the overloaded method
    public static void main(String args[]) {
        Multiply m = new Multiply();
        m.mul(6, 10);
        m.mul(10, 6, 5);
    }
}

//OUTPUT
// Multiply of two=60
// Multiply of three=300