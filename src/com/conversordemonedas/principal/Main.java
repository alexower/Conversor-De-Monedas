package com.conversordemonedas.principal;

import com.conversordemonedas.calculos.Conexion;
import com.conversordemonedas.calculos.Conversion;
import com.conversordemonedas.modelos.Moneda;

public class Main {
    public static void main(String[] args) {

        Conexion api = new Conexion();
        Moneda datos = api.conectarApi("MXN");
        System.out.println(datos);

        Double USD = datos.conversion_rates().get("USD");

        Conversion conversion = new Conversion();

        double result = conversion.convertir(20,USD);
        System.out.println("20 pesos son: "+result+ " dolares");

    }
}
