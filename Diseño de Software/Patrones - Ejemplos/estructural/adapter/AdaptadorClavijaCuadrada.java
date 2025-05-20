package estructural.adapter;

public class AdaptadorClavijaCuadrada extends ClavijaRedonda {
    private ClavijaCuadrada peg;

    public AdaptadorClavijaCuadrada(ClavijaCuadrada peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}