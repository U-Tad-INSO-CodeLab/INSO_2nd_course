package comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        Canal1 canal1 = new Canal1();

        Suscriptor suscriptor1 = new Suscriptor1();
        Suscriptor suscriptor2 = new Suscriptor2();

        canal1.suscribir(suscriptor1);
        canal1.suscribir(suscriptor2);

        canal1.setVideos(25);
        canal1.setVideos(30);
    }
}