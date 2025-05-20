package comportamiento.strategy;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Seleccione una estrategia:");
        System.out.println("[1] Restar");
        System.out.println("[2] Sumar");
        System.out.println("[3] Multiplicar");

        int opcion = scanner.nextInt();

        switch(opcion){
            case 1:
                contexto.setEstrategia(new EstrategiaRestar());
                break;
            case 2:
                contexto.setEstrategia(new EstrategiaSumar());
                break;
            case 3:
                contexto.setEstrategia(new EstrategiaMultiplicar());
                break;
        }

        int resultado = contexto.ejecutar(numero1, numero2);

        System.out.println("Resultado: "+ resultado);

    }
}