class Animal {
    //creating method eat
    public void eat()
    {
        System.out.println("I am omnivorous ");

    }
}
class Mammal extends Animal{
    //creating method nature
    public void nature() {
        System.out.println("I am Mammal");
    }
}
class Dog extends Mammal{
    public void sound() 
    {
        System.out.println("I Bark");
    }

    public static void main(String[] args) {
        Dog d =new Dog();
        d.eat();
        d.nature();
        d.sound();
        
    }
}
//OUTPUT
// c:\Users\VIKASH PATEL\Desktop\JAVA\PRATICAL\DAY4>cd "c:\Users\VIKASH PATEL\Desktop\JAVA\PRATICAL\DAY4\" && javac Dog.java && java Dog
// I am omnivorous 
// I am Mammal
// I Bark