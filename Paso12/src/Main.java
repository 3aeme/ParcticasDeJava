import java.util.Scanner;
public class Main {
    static Scanner consola = new Scanner(System.in);
    static int contador,cont1,cont2,cont3,cont4,cont5,def;
    public static void main(String[] args) {

        do{
            System.out.println("Ingrese el boleto que desea comprar \n1: 300 \n2: 400 \n3: 500 \n4: 600 \n5: 700");
            int menu = consola.nextInt();
            switch (menu){
                case 1 :
                    contador++;
                    cont1++;
                    System.out.println("Para terminar de comprar ingrese un numero distinto de 0");
                    def=consola.nextInt();
                    break;
                case 2 :
                    contador++;
                    cont2++;
                    System.out.println("Para terminar de comprar ingrese un numero distinto de 0");
                    def=consola.nextInt();
                    break;
                case 3 :
                    contador++;
                    cont3++;
                    System.out.println("Para terminar de comprar ingrese un numero distinto de 0");
                    def=consola.nextInt();
                    break;
                case 4 :
                    contador++;
                    cont4++;
                    System.out.println("Para terminar de comprar ingrese un numero distinto de 0");
                    def=consola.nextInt();
                    break;
                case 5 :
                    contador++;
                    cont5++;
                    System.out.println("Para terminar de comprar ingrese un numero distinto de 0");
                    def=consola.nextInt();
                    break;
                default:
                    System.out.println("Para terminar de comprar ingrese un numero distinto de 0");

            }

        } while (def==0);
        System.out.println("En total se vendieron:" + contador + " boletos\n" +
                "De 300 se vendieron: " + cont1 + " boletos\n" +
                "De 400 se vendieron: " + cont2 + " boletos\n" +
                "De 500 se vendieron: " + cont3 + " boletos\n" +
                "De 600 se vendieron: " + cont4 + " boletos\n" +
                "De 700 se vendieron: " + cont5 + " boletos\n");


    }
}