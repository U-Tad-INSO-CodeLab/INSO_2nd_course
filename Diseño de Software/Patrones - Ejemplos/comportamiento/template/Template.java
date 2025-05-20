package comportamiento.template;

public abstract class Template {
    public final void ejecutar(){
        paso1();
        paso2();
        paso3();
    }

    public final void paso1(){
        System.out.println("1. Ejecución obligatoria");
    }
    public abstract void paso2();
    public abstract void paso3();
}