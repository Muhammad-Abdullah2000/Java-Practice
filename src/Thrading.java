class MyThread1 extends Thread{                                        /////------> Thread class
    public void run(){
        for (int i = 0; i < 1;i++){
            System.out.println("My Thread1 is running");
            System.out.println("I'm Happy ");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int a = 0; a < 1; a++){
        System.out.println("This thread 2 is for chatting ");
        System.out.println("I'm also happy ");
        }
    }
}
class MyThreadRunnable1 implements Runnable{                                ////       Runnable Thread class interface
    public void run(){
        System.out.println("This is Interface Thread1 ");
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("This is Interface Thread2");
    }
}
class MyThreadRunnable3 implements Runnable{
    public void run(){
        int a = 4;
        int b = 5;
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
public class Thrading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
        MyThreadRunnable1 Bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(Bullet1);
        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
                Thread gun2 = new Thread(Bullet2);
                MyThreadRunnable3 Bullet3 = new MyThreadRunnable3();
                Thread gun3 = new Thread(Bullet3);

        gun1.start();
        gun2.start();
        gun3.start();
    }
}
