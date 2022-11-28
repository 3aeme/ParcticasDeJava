import java.util.Scanner;

public class Main {
    static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese La Matricula del alumno ");
        String matricula = consola.next();
        System.out.println("Ingrese la 1er nota");
        int cal1= consola.nextInt();
        System.out.println("Ingrese la 2da nota");
        int cal2= consola.nextInt();
        System.out.println("Ingrese la 3er nota");
        int cal3= consola.nextInt();
        System.out.println("Ingrese la 4ta nota");
        int cal4= consola.nextInt();
        System.out.println("Ingrese la 5ta nota");
        int cal5= consola.nextInt();
        System.out.println("Ingrese la 6ta nota");
        int cal6= consola.nextInt();
        int prom= (cal1+ cal2+ cal3+ cal4+ cal5 +cal6)/6;
        if(prom>6){
            System.out.println("EL alumno: " + matricula + " esta aprobado");

        }
        else{
            System.out.println("EL alumno: " + matricula +" esta reprobado");
        }



    }
}