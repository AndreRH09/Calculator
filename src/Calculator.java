import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public void interfacealculator() {
        int opcion = 1;
        while (1 <= opcion && opcion <= 5) {
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
    }

    public void SeleccionarOpciones(int opciones) {
        int num1 = 0, num2 = 0, result;

        if(opciones >=1 && opciones <= 5){
            num1 = obtenerNum("primer");
            num2 = obtenerNum("segundo");        
        }
        
        switch (opciones) {
            case 1:
            result = add(num1, num2);
            System.out.println("El resulatado de la sumas es "+result);
            break;
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
            default:
            System.out.println("Gracias por usar el programa");
            break;
        }
        
    }

    public int obtenerNum(String a) {
        System.out.print("Ingrese su "+a+" numero: ");
        int val = sc.nextInt();
        return val;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }
}
