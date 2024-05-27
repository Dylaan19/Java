import java.util.Scanner;

public class Tarea{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese el total de su factura");
    int factura = s.nextInt();
    System.out.println("La factura sin Iva es de: " + factura);
     double sinIva = factura * 0.21;
     System.out.println("El Iva es de: " + sinIva);
     System.out.println("La factura con Iva es de: " + (factura + sinIva));
     s.close();
    }
}
