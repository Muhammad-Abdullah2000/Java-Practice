

abstract class Parent2{
    public Parent2(){
        System.out.println("Hello I am constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

    public class Abstarct_Class_Lab {
        public static void main(String[] args) {
            // Parent2 p = new Parent2();               ------> Throwing a error
            Child2 c = new Child2();


        }
    }

