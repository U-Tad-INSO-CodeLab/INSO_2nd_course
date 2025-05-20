package comportamiento.strategy;

public class EstrategiaRestar implements Estrategia {

    @Override
    public int ejecutar(int numero1, int numero2) {
        return numero1 - numero2;
    }
}
