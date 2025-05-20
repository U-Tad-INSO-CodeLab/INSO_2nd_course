package creacion.abstractFactory;

public class FabricaMadera implements Fabrica {

    @Override
    public Mesa crearMesa() {
        return new MesaMadera();
    }

    @Override
    public Silla crearSilla() {
        return new SillaMadera();
    }
}