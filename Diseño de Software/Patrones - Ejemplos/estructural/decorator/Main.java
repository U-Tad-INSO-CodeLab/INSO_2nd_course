package estructural.decorator;

public class Main {
    public static void main(String[] args){
        //Crear una pistola y mostrar su descripción
        Arma pistola = new Pistola("Beretta", 800);
        System.out.println(pistola);

        //Añadir el silenciador
        System.out.println("\nAñadir silenciador a la pistola\n");
        pistola = new Silenciador(pistola);

        //Mostrar de nuevo los datos
        System.out.println("PRECIO NUEVO -> " + pistola.getPrecio() +"€");
    }
}