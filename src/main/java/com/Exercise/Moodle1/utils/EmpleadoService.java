package com.Exercise.Moodle1.utils;

import com.Exercise.Moodle1.model.Empleado;

public class EmpleadoService {
    public static double calcularSalarioFinal(Empleado emp){
        double salarioBase = emp.salarioBase();
        double bonoMensual = emp.bonoMensual();

        double salarioFinal = (salarioBase + (bonoMensual * 1.10))-(salarioBase *0.05);
        return salarioFinal;
    }

    public boolean tieneBonoExtra(Empleado emp){
        return emp.id() % 2 == 0;
    }
    public boolean validarLegibilidad(Empleado emp){
        return (emp.puntajeTest() > 85 && emp.edad() < 30)||(emp.idSede() == 1 && !emp.esActivo());
    }

    public double actualizarBono(Empleado emp, double incremento) {
        double bono = emp.bonoMensual();

        bono += incremento;
        return bono;
    }
}
