package creacion.abstractFactory;

public class Main {
    public static void main(String[] args){
        Fabrica fabrica = new FabricaMetal();
        Silla silla = fabrica.crearSilla();
        System.out.println(silla);
    }
}