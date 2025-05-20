package comportamiento.state;

public class EncendidoEstado implements Estado {

    @Override
    public void cambiar(Maquina maquina) {
        System.out.println("Apagando máquina...");
        maquina.setEstado(new ApagadoEstado());
    }
}