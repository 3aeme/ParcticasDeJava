import java.util.Scanner;

public class Main {
    static Scanner consola = new Scanner(System.in);
    static int mayor, menor, def;

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros que desea:");
        int x = consola.nextInt();
        int n [] = new int [x];
        for (int i = 0; i< n.length; i++){
            System.out.println("Ingrese un numero:");
            n [i] = consola.nextInt();
        }
        menor = n[0];
        do {
            System.out.println("1 para ver el numero mayor \n2 para ver el numero menor\n3 para salir");
            int menu = consola.nextInt();
            switch (menu) {
                case 1:
                    for (int i = 0; i < n.length; i++) {

                        if (n[i] > mayor) {
                            mayor = n[i];
                        }

                    }
                    System.out.println("El numero mas grande es: " + mayor);
                    break;

                case 2:
                    for (int i = 0; i < n.length; i++) {

                        if (n[i] <= menor) {

                            menor = n[i];
                        }

                    }
                    System.out.println("El numero mas chico es: " + menor);
                    break;
                case 3 :
                    def=1;
                    break;
                default:
                    System.out.println("Ingrese Una de las siguentes opciones");
            }

        }while (def  ==0) ;


    }
}