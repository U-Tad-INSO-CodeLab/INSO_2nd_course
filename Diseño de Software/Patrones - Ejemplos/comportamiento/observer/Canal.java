package comportamiento.observer;

public interface Canal {
    void suscribir(Suscriptor suscriptor);
    void elminarSuscriptor(Suscriptor suscriptor);
    void notificarSuscriptores();
}
