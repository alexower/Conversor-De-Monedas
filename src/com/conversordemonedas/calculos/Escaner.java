package com.conversordemonedas.calculos;

import com.conversordemonedas.modelos.NegativeNumberException;

import java.util.Scanner;

public class Escaner {

    public static double scanAmount() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto a convertir:");
        try {
            double amount = Double.parseDouble(teclado.nextLine());
            if (amount < 0) {
                throw new NegativeNumberException("El monto no puede ser negativo.");
            }
            return amount;
        } catch (NumberFormatException e) {
            System.out.println("Monto no válido, por favor intente de nuevo.");
            return scanAmount();
        } catch (NegativeNumberException e){
            System.out.println(e.getMessage());
            return scanAmount();
        }
    }
}
