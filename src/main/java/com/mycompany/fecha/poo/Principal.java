package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha fecha1; // Definición
        System.out.println("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int annio = sc.nextInt();
        fecha1 = new Fecha(dia, mes, annio); //Inicialización
        System.out.println(fecha1.validarFecha()==true?"La fecha ingresada es válida:":"La fecha es inválida.");
        if (fecha1.validarFecha()==true){
            System.out.println(fecha1.fechaLarga());
            //System.out.println(fecha1.fechaCorta());
        }
        
    }
}