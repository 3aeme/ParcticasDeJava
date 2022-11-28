import java.util.Scanner;
public class Main {
    static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la tabla deseada");
        int tabla=consola.nextInt();
        for(int i =1; i<11;i++){
            System.out.print(" " + i*tabla);
        }

    }
}