package comportamiento.state;

public class Main {
    public static void main(String[] args) {
        //Creamos la máquina, que viene siendo el contexto
        Maquina maquina = new Maquina();

        //Simulamos 4 cambios de estado
        for(int i=0; i<4; i++) maquina.utilizar();
    }
}