import java.util.Scanner;

public class Main {
    static Scanner consola = new Scanner(System.in);
    static int alumnota[] = new int [20];
    static float nota = 0;
    public static void main(String[] args) {
        for(int i = 0; i<20; i++) {
            System.out.println("Ingrese la nota del almuno ");
            alumnota[i] = consola.nextInt();
            nota = alumnota[i] + nota;
            }

        System.out.println("El promedio es de: " +nota / alumnota.length);

        for (int i = 19; i>=0; i--){
            System.out.println("Nota alumno " + (i +1)+ "= " + alumnota[i]);
        }



    }
}