package com.conversordemonedas.principal;

import com.conversordemonedas.calculos.Conexion;
import com.conversordemonedas.calculos.Conversion;
import com.conversordemonedas.modelos.Moneda;

import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conexion api = new Conexion();
        Moneda datos = api.conectarApi("USD","MXN",1);
        System.out.println(datos);
        Scanner teclado = new Scanner(System.in);
        while (true){
            String menu = "Bienvenido al conversor de modenas" +
                          "Seleccione una opcion:" +
                          "1. Dolares a pesos mexicanos" +
                          "2. Pesos mexicanos a dolares"+
                          "3. Dolares a pesos mexicanos" +
                          "4. Pesos mexicanos a dolares" +
                          "0. Salir";

            var opcion = Integer.valueOf(teclado.next()) ;

            if (opcion == 0){
                break;
            }
        }



        //Double USD = datos.conversion_result().get("USD");

        //Conversion conversion = new Conversion();

       // double result = conversion.convertir(20,USD);
       // System.out.println("20 pesos son: "+result+ " dolares");

    }
}
