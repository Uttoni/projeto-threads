import java.util.Random;

public class Sensor {
    public void medirTemperatura(){
        Random random = new Random();
        int minimo = 22;
        float temp = random.nextFloat() * 3;
        float temperatura = temp + minimo;
        System.out.println("Temperatura: " + String.format("%.2f", temperatura) + "ºC");
    }

    public void medirHumidade(){
        Random random = new Random();
        int minimo = 52;
        int hum = random.nextInt(6);
        int humidade = hum + minimo;
        System.out.println("Humidade: " + humidade + "%");
    }
}