package comportamiento.observer;

public class Suscriptor2 implements Suscriptor {

    @Override
    public void actualizar(int videos) {
        System.out.println("Suscriptor 2: " + videos + " vídeos nuevos");
    }
}