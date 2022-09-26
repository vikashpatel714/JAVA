class Laptop
{
   public void display()
    {
        System.out.println("working");
    }
}
class Dell extends Laptop
{
   public void print()
    {
        System.out.println("dell");
    }
}
class Lenovo extends Laptop
{
    public void show()
    {
        System.out.println("yoga");
    }
}
class TestDemo
{
public static void main(String args[]){
        Dell d = new Dell();
        d.print();
        d.display();
        Lenovo a = new Lenovo();
        a.show();
        a.display();
    }
}
//output
// \" && javac TestDemo.java && java TestDemo
// dell
// working
// yoga
// working