class A
{
String name;
public void teach(){
System.out.println("teaches mathmatics");
}
}
class Teacher extends A 
{
public void display(){
System.out.println("I am Mathmatics  : "+name);
}
public static void main(String[] args){
Teacher d=new Teacher();
d.name="Teacher";
d.display();
d.teach();
}
}



