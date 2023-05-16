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
        double result2;

        if(opciones >=1 && opciones <= 5){
            num1 = obtenerNum("primer");
            num2 = obtenerNum("segundo");        
        }
        
        switch (opciones) {
            case 1:
            result = add(num1, num2);
            System.out.println("La suma es "+result);
            break;

            case 2:
            result = sub(num1, num2);
            System.out.println("La resta es "+result);
            break;

            case 3:
            result = mult(num1, num2);
            System.out.println("La multiplicación es "+result);
            break;

            case 4:
            result2 = div(num1, num2);
            if(result2 != 0){
                System.out.println("La división es "+result2);
            }
            break;

            case 5:
            result = mod(num1, num2);
            if(result != -1){
                System.out.println("El módulo es "+result);
            }
            break;

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

    public int sub(int num1, int num2){
        return num1 - num2;
    }

    public int mult(int num1, int num2){
        return num1*num2;
    }

    public double div(int num1, int num2){
        if(num2 != 0){
            return num1*1.0/num2;
        }
        System.out.println("No se puede dividir entre 0");
        return 0;
    }

    public int mod(int num1, int num2){
        if(num2 != 0){
            return num1%num2;
        }
        System.out.println("No se puede dividir entre 0");
        return -1;
    }
}
