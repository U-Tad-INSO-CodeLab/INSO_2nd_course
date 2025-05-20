package creacion.factory;

public class Silla implements Producto {
    @Override
    public void utilizar(){
        System.out.println("Utilizando silla...");
    }
}