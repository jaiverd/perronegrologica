package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //entradas
        Scanner leerDato=new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientocliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        System.out.print("Ingrese su nombre:");
        nombreCliente= leerDato.nextLine();

        System.out.print("Ingrese su pais de origen:");
        paisCliente= leerDato.nextLine();

        System.out.print("Ingrse el ano de nacimiento:");
        anoNacimientocliente= leerDato.nextInt();

        System.out.print("Ingrese su mes de nacimiento:");
        mesNacimientoCliente= leerDato.nextInt();

        System.out.print("Ingrese su dia de nacimiento:");
        diaNacimientoCliente= leerDato.nextInt();

        // procesando las entradas

        // como calcular la edad
        //restar el año actual menos el año de nacimiento

        int edadCliente=2024-anoNacimientocliente;
        System.out.println("su edad es:"+edadCliente);

        //2.decidir si el client es mayor de edad

        if (edadCliente>=18){
            System.out.println("usted es mayor de edad ");
            // menu de licores
            // botella de guaro
            // botella de don julio
            //botella de blue label
            // botella de jaguer
            System.out.println("MENU");
            System.out.println("*** Botella de aguardiente antioqueño --$150 cop ***");
            System.out.println("*** Botella de don julio -- 200 cop ***");
            System.out.println("*** Botella de blue label -- 300 cop ***");
            System.out.println("*** Botela de jaguer -- 350 cop *** ");



        }else{
            System.out.println("usted es un niño vayase a dormir");
        }



    }
}