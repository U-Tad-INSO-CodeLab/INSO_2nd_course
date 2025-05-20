package creacion.factory;

public class Main {
    public static void main(String[] args){
        //Creación de dos fábricas, una de mesas y otra de sillas
        Fabrica fabricaMesas = new FabricaMesas();
        Fabrica fabricaSillas = new FabricaSillas();

        //Creación de una mesa y una silla como productos
        Producto mesa = fabricaMesas.crearProducto();
        Producto silla = fabricaSillas.crearProducto();

        //Utilizar los productos
        mesa.utilizar();
        silla.utilizar();
    }
}