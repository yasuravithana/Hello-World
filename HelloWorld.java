
public class HelloWorld {

    public static void main(String[] args) {
        Student student1;
        (student1 = new Student()).talk();
    }
}


class Student implements Person{

    @Override
    public void walk() {
        System.out.println("The student is walking.");
    }

    @Override
    public void talk() {
        System.out.println("Hello World!");
    }
    
}

interface Person{
    public void walk();
    public void talk();
}

