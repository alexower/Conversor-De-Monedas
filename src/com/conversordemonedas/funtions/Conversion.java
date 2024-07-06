package com.conversordemonedas.funtions;
import com.conversordemonedas.models.Moneda;


public class Conversion   {

    public void convertir (Moneda datos){
        String time = datos.time_last_update_utc();
        String base_code = datos.base_code();
        String target_code = datos.target_code();
        double conversion_rate = datos.conversion_rate();
        double conversion_result = datos.conversion_result();

        System.out.println(base_code+" ==> "+target_code);
        System.out.println("Tipo de cambio: 1" +" ["+base_code+"] ==>  "+conversion_rate+" ["+target_code+"]");
        System.out.println("Conversion ==> " + conversion_result+" ["+target_code+"]");
        System.out.println("Fecha de actualizacion: "+ time.substring(0,17));
    }


}
