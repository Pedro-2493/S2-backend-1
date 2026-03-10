package com.example;

public class Main {
    public static void main(String[] args) {
        /**
         * Este es el ejemplo de prueba de la clase libro.
         *  */

        Libro l1 = new Libro();
        l1.mostrarDetalles();
       
        Libro l2 = new Libro("Harry potter", "J.K Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El señor de los anillos", "J.R.R. Tolkien ", 1200);
        l3.mostrarDetalles();

/**
 * Este es el ejemplo de prueba de la case CuentaBancaria.
 */

        CuentaBancaria cuenta = new CuentaBancaria("Maria",  500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(1000);
        
    

    /**
     * Este es el ejemplo de prueba de la clase Estudiante.
     */

    Estudiante e = new Estudiante("pedro", 21, 2.5);
    e.mostrarInfo();

    Estudiante e2 = new Estudiante("Lucia", 23, 4.0);
    e2.mostrarInfo();

    }


}