package creacion.abstractFactory;

public class FabricaMetal implements Fabrica {

    @Override
    public Mesa crearMesa() {
        return new MesaMetal();
    }

    @Override
    public Silla crearSilla() {
        return new SillaMetal();
    }
}