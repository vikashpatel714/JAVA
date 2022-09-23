class Animal
{//method and fields
String name;
public void eat(){
System.out.println("I can eat");
}
}
//use of extends keyword to perform inheritance

class Dog extends Animal 
{//method and fields of Animal 
//method and fields of Dog
public void display(){
System.out.println("My name is : "+name);
}
public static void main(String[] args){
//creating an object of subclass (chieldclass)
Dog d=new Dog();
//acess field of super class
d.name="bulldog";
d.display();
//call method of super classusing object of subclass
d.eat();
}

}