import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public void interfacealculator() {
        int opcion = 1;
        while (1 <= opcion && opcion <= 6) {
            System.out.println("---------------------------\n\tCalculadora\n---------------------------");
            System.out.println("Ingrese su opción ");

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("//Escriba cualquier otro numero para terminar el programa");
            System.out.println("---------------------------");

            opcion = sc.nextInt();
            SeleccionarOpciones(opcion);
        }
        System.out.println("se ha terminado el programa");
    }

    public void SeleccionarOpciones(int opciones) {
        // switch (opciones) {
        // case 1:
        // add();
        // break;
        // case 2:
        // sub();
        // break;
        // case 3:
        // mul();
        // break;
        // case 4:
        // div();
        // break;
        // case 5:
        // mod();
        // break;
        // default:
        // break;
        // }
    }

    public int obtenerNum() {
        System.out.print("Ingrese su numero: ");
        int val = sc.nextInt();
        return val;
    }
}
