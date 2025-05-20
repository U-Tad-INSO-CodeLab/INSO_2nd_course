package creacion.factory;

public class FabricaMesas implements Fabrica {

    @Override
    public Producto crearProducto() {
        return new Mesa();
    }
}