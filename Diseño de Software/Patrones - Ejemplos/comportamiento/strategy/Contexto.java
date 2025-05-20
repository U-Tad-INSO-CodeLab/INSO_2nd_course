package comportamiento.strategy;

public class Contexto {
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia){
        this.estrategia = estrategia;
    }

    public int ejecutar(int numero1, int numero2){
        return estrategia.ejecutar(numero1, numero2);
    }
}