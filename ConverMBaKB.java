import java.util.Scanner;

public class ConverMBaKB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Mb a convertir");
        double mb = s.nextDouble();
        double kb = 1000;
        System.out.println(  mb + "MB quedan convertidos en " + (mb * kb) + " Kb");
        s.close();
    }
}