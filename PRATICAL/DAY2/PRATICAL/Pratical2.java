//  QUES-2 :create a program to demonstrate on multi level inheritance.

class S {
    public void display() {
       System.out.println(" display");
    }
 }
 class Rectangle extends S {
    public void area() {
       System.out.println("area");
    }
 }
 class Cube extends Rectangle {
    public void volume() {
       System.out.println("volume");
    }
 }
 public class Pratical2 {
    public static void main(String[] arguments) {
       Cube cube = new Cube();
       cube.display();
       cube.area();
       cube.volume();
    }
 }