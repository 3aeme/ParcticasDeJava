public class Main {
    public static void main(String[] args) {

        String suma = "suma2";
        for (int i = 0; i < 1800; i = i) {
            if (suma == "suma2") {
                i = i + 2;
                suma = "suma3";
            } else {
                i = i + 3;
                suma = "suma2";
            }
            System.out.print(" " + i);
        }
    }
}