package estructural.facade;

public class Main {
    public static void main(String[] args){
        //Creamos una ventana que hace de fachada, luego la iniciamos
        Ventana ventana = new Ventana("Diseño de Software", 480, 270);
        ventana.iniciar();
    }
}