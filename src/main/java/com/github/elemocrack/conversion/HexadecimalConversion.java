package com.github.elemocrack.conversion;

import com.github.elemocrack.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class HexadecimalConversion {
    public static List<String> decimalToHexadecimal(List<Integer> integerList) {
        List<Integer> convertedNums = new ArrayList<>();
        List<String> finalConversion = new ArrayList<>();
        for (int i = integerList.size() - 1; i >= 0; i -= 4) {
            List<Integer> nu = new ArrayList<>();
            nu.add(0, integerList.get(i));
            if (i - 1 >= 0) {
                nu.add(0, integerList.get(i - 1));
            }
            if (i - 2 >= 0) {
                nu.add(0, integerList.get(i - 2));
            }
            if (i - 3 >= 0) {
                nu.add(0, integerList.get(i - 3));
            }
            convertedNums.add(0, DecimalConversion.binaryToDecimal(nu));
        }
        for (int j = 0; j < convertedNums.size(); j++) {
            int actualNum = convertedNums.get(j);
            switch (actualNum) {
                case 10:
                    finalConversion.add("A");
                    break;
                case 11:
                    finalConversion.add("B");
                    break;
                case 12:
                    finalConversion.add("C");
                    break;
                case 13:
                    finalConversion.add("D");
                    break;
                case 14:
                    finalConversion.add("E");
                    break;
                case 15:
                    finalConversion.add("F");
                    break;
                default:
                    finalConversion.add(String.valueOf(actualNum));
            }
        }
        return finalConversion;
    }
    public static int hexadecimalToDecimal(String numbers){
        List<Integer> finalConversion = new ArrayList<>();
        for(String character: numbers.split("")){
            switch (character){
                case "A":
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    break;
                case "B":
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    break;
                case "C":
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    break;
                case "D":
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    break;
                case "E":
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    break;
                case "F":
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    break;
                case "1":
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    break;
                case "2":
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    break;
                case "3":
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    break;
                case "4":
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    break;
                case "5":
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    break;
                case "6":
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(0);
                    break;
                case "7":
                    finalConversion.add(0);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    finalConversion.add(1);
                    break;
                case "8":
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    break;
                case "9":
                    finalConversion.add(1);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(1);
                    break;
                case "0":
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    finalConversion.add(0);
                    break;
            }
        }
        int conversion = DecimalConversion.binaryToDecimal(finalConversion);
        ListUtil.showList(finalConversion);
        System.out.println("\n");
        return conversion;
    }
}
