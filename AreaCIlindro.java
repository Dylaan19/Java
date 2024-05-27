import java.util.Scanner;

public class AreaCIlindro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la Radio");
        double radio = s.nextDouble();
        double areaTotal = radio * radio;
        System.out.println("El area es de: " + (3.14 * areaTotal));
        s.close();
    }
}
