package com.example;


public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0;

        } else {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return  saldo;
    }

public void depositar (double cantidad){
    if (cantidad > 0) {
        this.saldo += cantidad;
        System.out.println("Deposito exitoso. Nuevo saldo: " + this.saldo);
    } else {
        System.out.println("Error: La cantidad a depositar debe ser positiva.");
    }
}

public void retirar (double cantidad) {
    if (cantidad <= 0) {
        System.out.println("Error cantidad invalida");
    } else if (cantidad > this.saldo) {
        System.out.println("Fondos insuficientes: " +" "+ cantidad);
    } else {
        this.saldo -= cantidad;
        System.out.println("Retiro exitoso. El saldo de su cuenta es: " +" "+ this.saldo);
    }
}

}
