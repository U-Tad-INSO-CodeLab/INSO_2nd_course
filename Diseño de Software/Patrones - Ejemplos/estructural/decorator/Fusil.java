package estructural.decorator;

public class Fusil implements Arma {
    //ATRIBUTOS
    private String nombre;
    private int precio;

    //CONSTRUCTOR
    public Fusil(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {return nombre;}

    @Override
    public int getPrecio() {return precio;}

    @Override
    public String toString() {return "Pistola - "+ nombre +" - "+ precio +"€";}
}