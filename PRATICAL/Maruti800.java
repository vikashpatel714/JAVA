class Car{
    //default constructor of car
       public Car()
       {
        System.out.println("Class Car");
       }
       public void vehicleType()
       {
        System.out.println("Vehicle Type: Car");
       }
    }
    class Maruti extends Car{
    //default constructor of maruti class
       public Maruti()
       {
        System.out.println("Class Maruti");
       }
       public void brand()
       {
        System.out.println("Brand: Maruti");
       }
       public void speed()
       {
        System.out.println("Max: 90Kmph");
       }
    }
    public class Maruti800 extends Maruti{
    //default constructor of maruti800 class
    
       public Maruti800()
       {
        System.out.println("Maruti Model: 800");
    }
       public void speed()
       {
        System.out.println("Max: 80Kmph");
       }
       public static void main(String args[])
       {
         Maruti800 obj=new Maruti800();
         obj.vehicleType();
         obj.brand();
         obj.speed();
       }
    }

//output-
// && java Maruti800
//Class Car
//Class Maruti
//Maruti Model: 800
//Vehicle Type: Car
//Brand: Maruti
//Max: 80Kmph
