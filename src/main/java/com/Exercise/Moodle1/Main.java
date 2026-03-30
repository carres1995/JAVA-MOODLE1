package com.Exercise.Moodle1;

import com.Exercise.Moodle1.utils.EmpleadoService;
import com.Exercise.Moodle1.model.Empleado;

public class Main {

    public static void main(String[] args) {
        System.out.println("INICIANDO PROGRA...");
        //Instanciacion de empleado
        Empleado emp = new Empleado(2L, 2000, 300, 70, 30, 2, false);

        String nulo = null;
        System.out.println(nulo.length());
        //provocar NullPoiterException
        //En JAVA 8 muy poca informacion (Exception in thread "main" java.lang.NullPointerException)
        /*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "nulo" is null
        at com.Exercise.Moodle1.Main.main(Main.java:14)*/

        EmpleadoService service = new EmpleadoService();
        String form = String.format("""
            valor salario: %f,
            bono extra? %s,
            es elegible? %s,
            nuevo bono: %f
            """, service.calcularSalarioFinal(emp),service.tieneBonoExtra(emp),service.validarLegibilidad(emp), service.actualizarBono(emp,100));
            
        System.out.println(form);
        System.out.println("FINALIZANDO PROGRA...");
    }

}
