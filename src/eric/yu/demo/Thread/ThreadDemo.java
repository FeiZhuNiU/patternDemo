package eric.yu.demo.Thread;

/**
 * Created by yulin on 15-4-26.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Sample sample = new Sample();

        Thread thread1 = new IncreaseThread(sample);
        Thread thread3 = new IncreaseThread(sample);
        Thread thread2 = new DecreaseThread(sample);
        Thread thread4 = new DecreaseThread(sample);



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    public static class Sample{
        int i ;

        public synchronized void increase(){
            while(i!=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
            System.out.println(Thread.currentThread().getName() + ": "+ i);
            notify();
        }

        public synchronized void decrease(){
            while(i==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i--;
            System.out.println(Thread.currentThread().getName() + ": "+ i);
            notify();
        }
    }

    public static class IncreaseThread extends Thread{
        private Sample sample;

        public IncreaseThread(Sample sample){
            this.sample = sample;
        }
        @Override
        public void run() {
            for(int i = 0; i <20; ++i){
                try {
                    Thread.sleep((long)(Math.random()*100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sample.increase();
            }
        }
    }

    public static class DecreaseThread extends Thread{
        private Sample sample;

        public DecreaseThread(Sample sample){
            this.sample = sample;
        }

        @Override
        public void run() {
            for(int i = 0; i < 20; ++i){
                try {
                    Thread.sleep((long)(Math.random()*100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sample.decrease();
            }
        }
    }




}
