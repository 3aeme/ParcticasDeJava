import java.util.Scanner;

public class Main {
    static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el sueldo deseado");
        int sueldo = consola.nextInt();

        if (sueldo<1000){
            System.out.print("Su sueldo aumentado es de: " + sueldo*1.15);
        } else if (sueldo>=1000) {
            System.out.println("Su sueldo aumentado es de:" + sueldo*1.12);

        }

    }
}