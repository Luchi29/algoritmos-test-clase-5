package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Escribe una función que traduzca de números romanos a decimales romanToDecimal(roman). En aras de mantener el kata
 * simple, asumamos que ya vienen validados los números.
 *
 * Los números romanos, del sistema de numeración de la antigua Roma usaba combinaciones de letras del alfabeto latino
 * para representar valores. Consta de siete símbolos:
 *
 * | Símbolo | Valor |
 * | I       | 1     |
 * | V       | 5     |
 * | X       | 10    |
 * | L       | 50    |
 * | C       | 100   |
 * | D       | 500   |
 * | M       | 1000  |
 *
 * Ejemplos:
 *
 * MMVI = 1000 + 1000 + 5 + 1 = 2006
 * MCMXLIV = 1000 + (1000 - 100) + (50 - 10) + (5 - 1) = 1944
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class NumerosRomanos {

    @Test
    void romanToDecimal() {
        final var roman = romanToDecimals.translate("MMVI");
        final var convertido = 2006;
        Assertions.assertEquals(convertido, roman);
    }

    @Test
    void romanToDecimal2() {
        final var roman = romanToDecimals.translate("MCMXLIV");
        final var convertido = 1944;
        Assertions.assertEquals(convertido, roman);
    }
}
