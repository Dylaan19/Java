import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("El pago por hora es de 15 dolares");
        System.out.println("Ingrese las horas trabajadas");
        int horasPagas = s.nextInt();
        System.out.println("El salario obtenido por la cantidad de " + horasPagas + " horas es de: " + (horasPagas * 15) + " dolares");
        s.close();
    }
}
