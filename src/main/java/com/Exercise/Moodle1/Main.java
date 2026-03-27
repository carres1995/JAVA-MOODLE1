package com.Exercise.Moodle1;

import com.Exercise.Moodle1.utils.EmpleadoService;
import com.Exercise.Moodle1.model.Empleado;

public class Main {

    public static void main(String[] args) {
        System.out.println("INICIANDO PROGRA...");
        Empleado emp = new Empleado(2L, 2000, 300, 70, 30, 2, false);

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
