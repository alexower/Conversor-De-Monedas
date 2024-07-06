package com.conversordemonedas.Main;

import com.conversordemonedas.funtions.ApiConnector;
import com.conversordemonedas.funtions.Conversion;
import com.conversordemonedas.funtions.Escaner;
import com.conversordemonedas.models.Moneda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApiConnector api = new ApiConnector();
        Conversion conversion = new Conversion();
        Scanner teclado = new Scanner(System.in);

        String menu = """
                    *************************************
                    Bienvenido al conversor de monedas\s
                           Seleccione una opcion:\s
                    1. Dolar ==> Peso Mexicano
                    2. Pesos Mexicano ==> Dolar
                    3. Euro ==> Dolar
                    4. Dolar ==> Euro
                    5. Yen ==> Dolar
                    6. Dolar ==> Yen
                    7. Real brasileño  ==> Dolar
                    8. Dolar ==> Real Brasileño
                    9. Peso Colombiano ==> Dolar
                    10.Dolar ==> Peso Colombiano
                    0. Salir
                    *************************************
                    """;

        boolean continuar = true;
        while (continuar){
            System.out.println(menu);

            try {
                var opcion = Integer.parseInt(teclado.next());
                switch (opcion){
                    case 1:
                        Moneda datos = api.conectarApi("USD","MXN", Escaner.scanAmount());
                        conversion.convertir(datos);
                        break;
                    case 2:
                        Moneda datos2 = api.conectarApi("MXN","USD",Escaner.scanAmount());
                        conversion.convertir(datos2);
                        break;
                    case 3:
                        Moneda datos3 = api.conectarApi("EUR","USD",Escaner.scanAmount());
                        conversion.convertir(datos3);
                        break;
                    case 4:
                        Moneda datos4 = api.conectarApi("USD","EUR",Escaner.scanAmount());
                        conversion.convertir(datos4);
                        break;
                    case 5:
                        Moneda datos5 = api.conectarApi("JPY","USD",Escaner.scanAmount());
                        conversion.convertir(datos5);
                        break;
                    case 6:
                        Moneda datos6 = api.conectarApi("USD","JPY",Escaner.scanAmount());
                        conversion.convertir(datos6);
                        break;
                    case 7:
                        Moneda datos7 = api.conectarApi("BRL","USD",Escaner.scanAmount());
                        conversion.convertir(datos7);
                        break;
                    case 8:
                        Moneda datos8 = api.conectarApi("USD","BRL",Escaner.scanAmount());
                        conversion.convertir(datos8);
                        break;
                    case 9:
                        Moneda datos9 = api.conectarApi("COP","USD",Escaner.scanAmount());
                        conversion.convertir(datos9);
                        break;
                    case 10:
                        Moneda datos10 = api.conectarApi("USD","COP",Escaner.scanAmount());
                        conversion.convertir(datos10);
                        break;
                    case 0 :
                        continuar = false;
                        break;
                    default:
                        System.out.println("Seleccione una opcion del menu!");
                }
            }catch (NumberFormatException e){
                System.out.println("Solo se admiten numeros!, Error: "+ e.getMessage());
            }
        }
        System.out.println("Finalizacion del programa! ");
        }
    }

