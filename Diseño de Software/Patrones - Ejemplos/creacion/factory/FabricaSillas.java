package creacion.factory;

public class FabricaSillas implements Fabrica {

    @Override
    public Producto crearProducto() {
        return new Silla();
    }
}