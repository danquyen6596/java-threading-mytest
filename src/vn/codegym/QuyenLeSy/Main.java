package vn.codegym.QuyenLeSy;

public class Main {
    public static int MAX_PRIORITY = 10;
    public static int MIN_PRIORITY = 1;

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
