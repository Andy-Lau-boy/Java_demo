package Advanced.A_Thread;

public class SleepDemo implements Runnable{

    @Override
    public void run() {

        for(int i=0;i<5;i++){

            System.out.println(Thread.currentThread().getName()+"执行第"+i+"次");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        SleepDemo sleepDemo=new SleepDemo();
        Thread demo1=new Thread(sleepDemo,"Andy");
        demo1.start();
    }
}
