package com.redbee.clase5.ejercicios;

import java.util.HashMap;

public class romanToDecimals {

    public static Integer translate(String roman) {

        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('X', 10);
        romanNumbers.put('C', 100);
        romanNumbers.put('M', 1000);
        romanNumbers.put('V', 5);
        romanNumbers.put('L', 50);
        romanNumbers.put('D', 500);

        int numDecimal = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int temp = romanNumbers.get(roman.charAt(i));
            if (temp < prev) {
                numDecimal -= temp;
            } else {
                numDecimal += temp;
            }
            prev = temp;
        }
        System.out.println(numDecimal);
        return numDecimal;
    }

}

