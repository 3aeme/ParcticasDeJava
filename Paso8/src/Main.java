import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner consola = new Scanner(System.in);
    static ArrayList<Integer> sueldos = new ArrayList<>();
    static int sueldo=0;

    public static void main(String[] args) {

            System.out.println("Ingrese la cantidad de empleados que va a registrar");
            int empleados =consola.nextInt();
            for(int i = 0; i<empleados;i++){
                System.out.println("Ingrese el sueldo deseado");
                sueldo = consola.nextInt();
                sueldos.add(sueldo);

            }
            System.out.println("--------Sueldos Base--------");
            for(int i=0; i<sueldos.size(); i++){
                System.out.println("El empleado " + (i+1) + " tiene un sueldo base de: "+ sueldos.get(i));
            }
            System.out.println("--------Sueldo Total--------");
            for(int i =0; i<sueldos.size(); i++){
                if (sueldos.get(i)<1000){
                    System.out.println("La nomina total del empleado " + (i+1) +  " es de: " + sueldos.get(i)*1.15);
                } else if (sueldos.get(i)>=1000) {
                    System.out.println("La nomina total del empleado " + (i+1) + " es de:" + sueldos.get(i) * 1.12);
                }

            }



    }
}
