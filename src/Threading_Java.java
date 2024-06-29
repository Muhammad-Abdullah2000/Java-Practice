class Threading_Java extends Thread {
     public static int amount = 0;
    public static void main(String[] args) {

        Threading_Java thread = new Threading_Java();
        thread.start();
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }

        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }
}
    class Threading_Java1 extends Thread {
public static int amount = 0;
public static void main(String[] args) {

        Threading_Java1 thread = new Threading_Java1();
        thread.start();
        while (thread.isDaemon()) {
        System.out.println("Waiting...");
        }

        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
        }

public void run() {
        amount++;
        }
   }
