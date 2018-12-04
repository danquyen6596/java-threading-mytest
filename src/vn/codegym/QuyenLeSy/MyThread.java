package vn.codegym.QuyenLeSy;

public class MyThread implements Runnable {
    @Override
    public void run() {
        long endTimes;
        int i=0;
        try {
            while(i<10) {
                System.out.println(i);
                i++;
                endTimes = System.currentTimeMillis();
                System.out.println(endTimes);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
