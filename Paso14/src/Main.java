import java.util.Scanner;
public class Main {
    static Scanner consola = new Scanner(System.in);
    static int resultado= 1, cont;
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        int num= consola.nextInt();
        System.out.println("Ingrese el grado de la potencia");
        int num2= consola.nextInt();

        while(cont<num2){
            resultado= num*resultado;
            cont++;
        }
        System.out.println("El resutado es= " + resultado);



    }
}