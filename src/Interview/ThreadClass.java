package Interview;

public class ThreadClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        Thread t = new Thread(t1);
        t.start();
    }
}


