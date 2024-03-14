package com.github.elemocrack.conversion;

import java.util.ArrayList;
import java.util.List;

public class DecimalConversion {
    public static List<Integer> decimalToBinary(int num) {
        List<Integer> binary = new ArrayList<>();
        while (num > 0) {
            binary.add(0, num % 2);
            num -= num % 2;
            num -= num / 2;
        }
        return binary;
    }
    public static int binaryToDecimal(List<Integer> binaryList) {
        int suma = 0;
        for (int i = binaryList.size() - 1; i >= 0; i--) {
            int pos = binaryList.size() - 1 - i;
            int i1 = (binaryList.get(i) % 2) * (int) Math.pow(2, (pos));
            suma += i1;
        }
        return suma;
    }
}
