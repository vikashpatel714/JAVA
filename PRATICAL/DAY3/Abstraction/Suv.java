abstract class Bike{  
    abstract void run();  
  }  
  class Suv extends Bike{  
  void run(){System.out.println("safely");}  
  public static void main(String args[]){  
   Bike obj = new Suv();  
   obj.run();  
  }  
  }  