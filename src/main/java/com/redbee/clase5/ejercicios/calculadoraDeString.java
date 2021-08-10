package com.redbee.clase5.ejercicios;

import java.util.Objects;

import static java.lang.Integer.parseInt;

public class calculadoraDeString {

    public static Integer calcular(String operacion) {
        Integer resultado = 0;
        if (operacion == " " || operacion == null) {
            resultado = 0;

        } else if(operacion.length() == 1) {
            resultado = parseInt(operacion);

        } else if(operacion.length() > 1 && operacion.charAt(1) == '+') {
            Integer operandoUno = Character.getNumericValue(operacion.charAt(0));
            Integer operandoDos = Character.getNumericValue(operacion.charAt(2));
            resultado = operandoUno + operandoDos;

        } else if(operacion.length() > 1 && operacion.charAt(1) == '-') {
            Integer operandoUno = Character.getNumericValue(operacion.charAt(0));
            Integer operandoDos = Character.getNumericValue(operacion.charAt(2));
            resultado = Math.abs(operandoUno - operandoDos);
        }




        return resultado;
    }
    }
