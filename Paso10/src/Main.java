import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    static Scanner consola = new Scanner(System.in);
    static ArrayList<Integer> compra = new ArrayList<>();
    static int gasto= 0;

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de productos que va a comprar");
        int productos =consola.nextInt();
        for(int i = 0; i<productos;i++){
            System.out.println("Ingrese el costo del producto");
            gasto = consola.nextInt();
            compra.add(gasto);
        }
        int sum = compra.stream().mapToInt(Integer::intValue).sum();

        System.out.println("--------Total a pagar--------");

            if (sum<500){
                System.out.println("El total a pagar es: " + sum);
            } else if (sum<1000) {
                System.out.println("El total a pagar es: " + sum*0.95);
            } else if (sum<7000) {
                System.out.println("El total a pagar es: " + sum*0.89);
            }else if (sum<15000) {
                System.out.println("El total a pagar es: " + sum*0.82);
            }else if (sum>15000) {
                System.out.println("El total a pagar es: " + sum*0.75);
            }





    }
}