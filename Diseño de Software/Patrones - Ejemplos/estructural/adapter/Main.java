package estructural.adapter;

public class Main {
    public static void main(String[] args) {
        HuecoRedondo hueco = new HuecoRedondo(5);
        ClavijaRedonda clavijaRedonda = new ClavijaRedonda(5);
        if(hueco.fits(clavijaRedonda)){
            System.out.println("La clavija redonda r5 encaja en el hueco redondo r5.");
        }

        ClavijaCuadrada smallSqPeg = new ClavijaCuadrada(2);
        ClavijaCuadrada largeSqPeg = new ClavijaCuadrada(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        AdaptadorClavijaCuadrada smallSqPegAdapter = new AdaptadorClavijaCuadrada(smallSqPeg);
        AdaptadorClavijaCuadrada largeSqPegAdapter = new AdaptadorClavijaCuadrada(largeSqPeg);
        if(hueco.fits(smallSqPegAdapter)) {
            System.out.println("La clavija cuadrada w2 encaja en el hueco redondo r5.");
        }
        if (!hueco.fits(largeSqPegAdapter)) {
            System.out.println("La clavija cuadrada w20 no encaja en el orificio redondo r5.");
        }

    }
}