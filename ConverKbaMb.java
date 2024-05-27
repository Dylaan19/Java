import java.util.Scanner;

public class ConverKbaMb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Kb a convertir");
        double kb = s.nextDouble();
        double mb = 1000;
        System.out.println(  kb + "Kb quedan convertidos en " + (kb / mb) + " Mb");
        s.close();
    }
}

