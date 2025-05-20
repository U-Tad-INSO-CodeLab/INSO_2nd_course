package estructural.adapter;

public class ClavijaCuadrada {
    private double width;

    public ClavijaCuadrada(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}