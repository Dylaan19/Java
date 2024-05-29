package Datos;

import java.util.Scanner;

public class Nuevo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        double notaUno =s.nextDouble();
        System.out.println("Ingrese la segunda nota");
        double notaDos = s.nextDouble();
        System.out.println("Ingrese la tercera nota");
        double notaTres = s.nextDouble();
        double promedioNota = ((notaUno + notaDos + notaTres) / 3);
       // System.out.println("El promedio de las notas es de: " + ((notaUno + notaDos + notaTres) / 3));
        if (promedioNota <= 3) {
            System.out.println("La nota es Insuficiente");            
        }
        if (promedioNota >=4) && (promedioNota <= 6)  {
            
        }
        s.close();
    }
}
