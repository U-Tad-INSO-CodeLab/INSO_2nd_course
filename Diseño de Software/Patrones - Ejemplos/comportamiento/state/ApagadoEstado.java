package comportamiento.state;

public class ApagadoEstado implements Estado {

    @Override
    public void cambiar(Maquina maquina){
        System.out.println("Encendiendo máquina...");
        maquina.setEstado(new EncendidoEstado());
    }
}