package estructural.decorator;

public class Silenciador implements Decorador {

    private Arma arma;
    private String nombre;
    private int precio;

    public Silenciador(Arma arma){
        this.arma = arma;
        this.nombre = "silenciador";
        this.precio = 100;
    }

    @Override
    public Arma getArma() {return arma;}

    @Override
    public String getNombre() {return nombre;}

    @Override
    public int getPrecio() {return arma.getPrecio() + precio;}
}