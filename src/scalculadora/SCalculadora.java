
package scalculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SCalculadora {

    
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double num1, num2;
        int opc;
        int salir = 0;
        try {    
        do {

                System.out.println("=========MENU==========");
                System.out.println("-------------------------------");
                System.out.println("Ingrese la opción que desea realizar: ");
                System.out.println("opc 1. Sumar 2 numeros");
                System.out.println("opc 2. Restar 2 numeros");
                System.out.println("opc 3. Multiplicar 2 numeros");
                System.out.println("opc 4. Dividir 2 numeros");
                System.out.println("opc 5. Mayor de 2 numeros");
                System.out.println("opc 6. Sacar porcentaje de un numero");
                System.out.println("opc 7. Salir");
                System.out.print("Ingrese una opción: ");
                opc = intro.nextInt();

                while (opc < 1 || opc > 7) {
                    System.out.println("Ingrese una opción valida: ");
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese la opción que desea realizar: ");
                    System.out.println("opc 1. Sumar 2 numeros");
                    System.out.println("opc 2. Restar 2 numeros");
                    System.out.println("opc 3. Multiplicar 2 numeros");
                    System.out.println("opc 4. Dividir 2 numeros");
                    System.out.println("opc 5. Mayor de 2 numeros");
                    System.out.println("opc 6. Sacar porcentaje de un numero");
                    System.out.println("opc 7. Salir");
                    System.out.print("Ingrese una opción: ");
                    opc = intro.nextInt();
                }

                switch (opc) {
                    case 1:
                        System.out.println("Ingrese 2 numeros: ");
                        System.out.print("1er numero: ");
                        num1 = intro.nextDouble();
                        System.out.print("2do numero: ");
                        num2 = intro.nextDouble();
                        System.out.println("La suma de los numeros es: " + (int) (num1 + num2));
                        System.out.println("---------------------------------");
                        break;
                    case 2:
                        System.out.println("Ingrese 2 numeros: ");
                        System.out.print("1er numero: ");
                        num1 = intro.nextDouble();
                        System.out.print("2do numero: ");
                        num2 = intro.nextDouble();
                        System.out.println("La resta de los numeros es: " + (int) (num1 - num2));
                        System.out.println("---------------------------------");
                        break;
                    case 3:
                        System.out.println("Ingrese 2 numeros: ");
                        System.out.print("1er numero: ");
                        num1 = intro.nextDouble();
                        System.out.print("2do numero: ");
                        num2 = intro.nextDouble();
                        System.out.println("La multiplicacion de los numeros es: " + (int) (num1 * num2));
                        System.out.println("---------------------------------------");
                        break;
                    case 4:
                        System.out.println("Ingrese 2 numeros: ");
                        System.out.print("1er numero: ");
                        num1 = intro.nextDouble();
                        System.out.print("2do numero: ");
                        num2 = intro.nextDouble();
                        if (num2 == 0) {
                            System.out.println("La division por 0 es invalida");
                            System.out.println("------------------------------");
                        } else {
                            System.out.println("La division de los numeros es: " + (int) (num1 / num2));
                            System.out.println("----------------------------------");
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese 2 numeros: ");
                        System.out.print("1er numero: ");
                        num1 = intro.nextDouble();
                        System.out.print("2do numero: ");
                        num2 = intro.nextDouble();
                        if (num1 == num2) {
                            System.out.println("Los numeros son iguales");
                            System.out.println("------------------------");
                        } else {
                            if (num1 > num2) {
                                System.out.println("El numero " + num1 + " es mayor que " + num2);
                                System.out.println("---------------------------------");
                            } else {
                                if (num2 > num1) {
                                    System.out.println("El numero " + num2 + " es mayor que " + num1);
                                    System.out.println("---------------------------------");
                                }
                            }
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese un numero: ");
                        num1 = intro.nextDouble();
                        System.out.print("Ingrese el porcentaje: ");
                        num2 = intro.nextDouble();
                        System.out.println("El " + num2 + "% de " + num1 + " es: " + ((num1 * num2) / 100));
                        System.out.println("----------------------------------");
                        break;
                    case 7:
                        System.out.println("¿Desea salir?");
                        System.out.println("opcion 1. Si");
                        System.out.println("opcion 2. No");
                        salir = intro.nextInt();
                        break;
                }
            } while (opc != 7 || salir == 2);
        
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Ingrese un valor numerico porfavor");

            } finally {
                System.out.println("Hasta Luego");
            }
        }
    }

