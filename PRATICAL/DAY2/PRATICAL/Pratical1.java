// superclass
class Teacher {

    public void print1() {
        System.out.println("I am teacher");// superclass
    }
}

// subclass
class Student extends Teacher {

    public void print2() {
        System.out.println("I am student");//subclass
    }
}

class Pratical1 {

    public static void main(String[] args) {
        // creating object of subclass
        Student st = new Student();

        st.print1();
        st.print2();
    }
}