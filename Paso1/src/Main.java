import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num, i, impar = 0, par = 0, resi;
        for (i = 1; i <= 10; ++i) {
            System.out.print("ingresar numero: ");
            num = consola.nextInt();
            resi = num % 2;
            if (resi == 0) {
                par = par + num;

            }
            if (resi != 0)
                impar = impar + num;
        }

        System.out.println("el promedio de los numeros pares es: " + par);
        System.out.println("la suma de los numeros impares son: " + impar);
    }
}