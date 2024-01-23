package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String nombreFruta;
        boolean estaEnTemporada=true;
        Integer costoCarga;

        System.out.print("Ingrese la fruta: ");
        nombreFruta=lea.nextLine();

        System.out.print("Esta en temporada: ");
        estaEnTemporada=lea.nextBoolean();

        if(estaEnTemporada==true){
            System.out.println("La fruta es Colombiana? ");
            boolean esColombiana=lea.nextBoolean();
            if(esColombiana==true){
                costoCarga=100000;
                System.out.println("El costo es: "+costoCarga);
            }else{
                costoCarga=200000;
                System.out.println("El costo es: "+costoCarga);
            }
        }else{
            costoCarga=350000;
            System.out.println("El costo es: "+costoCarga);
        }

    }
}