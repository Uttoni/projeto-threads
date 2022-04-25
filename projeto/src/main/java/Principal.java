import java.lang.*;

public class Principal {

    public static void main(String args[]){
        new Thread(thread1).start();
        new Thread(thread2).start();
    }

    private static Runnable thread1=new Runnable() {
        @Override
        public void run() {
            Sensor sensor = new Sensor();
            for (int i = 0; i < 10; i++) {
                sensor.medirTemperatura();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    private static Runnable thread2=new Runnable() {
        @Override
        public void run() {
            Sensor sensor = new Sensor();
            for (int i = 0; i < 10; i++) {
                sensor.medirHumidade();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };
}

