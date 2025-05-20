package estructural.decorator;

public class Culata implements Decorador {

    private Arma arma;
    private String nombre;
    private int precio;

    public Culata(Arma arma){
        this.arma = arma;
        this.nombre = "culata";
        this.precio = 30;
    }

    @Override
    public Arma getArma() {return arma;}

    @Override
    public String getNombre() {return nombre;}

    @Override
    public int getPrecio() {return arma.getPrecio() + precio;}
}