package comportamiento.state;

public class Maquina {
    private Estado estado;

    public Maquina(){
        this.estado = new ApagadoEstado();
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void utilizar(){
        estado.cambiar(this);
    }
}
