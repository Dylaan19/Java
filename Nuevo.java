package Datos;

import java.util.Scanner;

public class Nuevo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas");   
        int horaPaga = s.nextInt();
        if (horaPaga <= 40) {
            System.out.println("Su sueldo por las " + horaPaga + " horas trabajadas es de: " + (horaPaga * 12));
        }
        else{
            if (horaPaga > 40) {
                System.out.println("Su sueldo por las " + horaPaga + " horas trabajadas es de: " + (horaPaga * 16));   
            }
        }
        s.close();
    }
}

