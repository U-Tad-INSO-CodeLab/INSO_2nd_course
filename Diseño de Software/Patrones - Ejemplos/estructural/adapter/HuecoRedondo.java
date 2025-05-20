package estructural.adapter;

public class HuecoRedondo {
    private double radius;

    public HuecoRedondo(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(ClavijaRedonda peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}