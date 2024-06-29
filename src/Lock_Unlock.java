import java.util.concurrent.locks.ReentrantLock;
public class Lock_Unlock {
    public static void main(String[] args) {
        ReentrantLock lock;
        lock = new ReentrantLock();
        int c = 0;
        {
            lock.lock();
            try {
                c++;
            } finally {
                lock.unlock();
            }
            System.out.println(c);
        }
    }
}