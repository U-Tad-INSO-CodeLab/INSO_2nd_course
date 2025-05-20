package comportamiento.observer;

public class Suscriptor1 implements Suscriptor {

    @Override
    public void actualizar(int videos) {
        System.out.println("Suscriptor 1: " + videos + " vídeos nuevos");
    }
}