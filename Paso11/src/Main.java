import java.util.Scanner;

public class Main {
    static Scanner consola = new Scanner(System.in);
    static int mayor;

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de sueldos que desea:");
        int x = consola.nextInt();
        int n [] = new int [x];
        for (int i = 0; i< n.length; i++) {
            System.out.println("Ingrese el sueldo:");
            n[i] = consola.nextInt();
        }

                    for (int i = 0; i < n.length; i++) {

                        if (n[i] > mayor) {
                            mayor = n[i];
                        }

                    }
                    System.out.println("El numero mas grande es: " + mayor);




    }
}