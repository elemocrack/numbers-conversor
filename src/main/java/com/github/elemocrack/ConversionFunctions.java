package com.github.elemocrack;

import com.github.elemocrack.conversion.DecimalConversion;
import com.github.elemocrack.conversion.HexadecimalConversion;
import com.github.elemocrack.util.ListUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConversionFunctions {
    public ConversionFunctions() {
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println("---------- \n1 Decimal a binario \n2 Binario a decimal \n3 Binario a hexadecimal \n4 Decimal a hexadecimal\n5 Hexadecimal a decimal");
            if (scanner.hasNextInt()) {
                int options = scanner.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("Ingrese el numero a convertir a binario");
                        int number = scanner.nextInt();
                        List<Integer> binaryNums = DecimalConversion.decimalToBinary(number);
                        ListUtil.showList(binaryNums);
                        break;
                    case 2:
                        List<Integer> binaryList;
                        System.out.println("Ingrese un numero binario");
                        String inputNum = scanner.next();
                        try {
                            binaryList = Arrays.asList(inputNum.split("")).stream().map(caracterString -> {
                                if (!(caracterString.equals("1") || caracterString.equals("0"))) {
                                    throw new RuntimeException();
                                }
                                return Integer.parseInt(caracterString);
                            }).toList();
                        } catch (RuntimeException e) {
                            System.out.println("Debes ingresar solo 0 o 1");
                            break;
                        }
                        System.out.println("El numero binario convertido a decimal es: " + DecimalConversion.binaryToDecimal(binaryList));
                        break;
                    case 3:
                        List<Integer> numeroLista;
                        System.out.println("Ingrese un numero binario");
                        String inputNumber = scanner.next();
                        try {
                            numeroLista = Arrays.asList(inputNumber.split("")).stream().map(caracterString -> {
                                if (!(caracterString.equals("1") || caracterString.equals("0"))) {
                                    throw new RuntimeException();
                                }
                                return Integer.parseInt(caracterString);
                            }).toList();
                        } catch (RuntimeException e) {
                            System.out.println("Debes ingresar solo 0 o 1");
                            break;
                        }
                        List<String> newList = HexadecimalConversion.hexadecimalList(numeroLista);
                        ListUtil.showList(newList);
                        break;
                    case 4:
                        System.out.println("Ingrese el numero a transformar de decimal a hexa");
                        if (scanner.hasNextInt()) {
                            int num = scanner.nextInt();
                            List<Integer> integerList = DecimalConversion.decimalToBinary(num);
                            ListUtil.showList(HexadecimalConversion.hexadecimalList(integerList));
                        } else {
                            System.out.println("Tiene que ingresar numeros");
                            scanner.nextLine();
                        }
                        break;
                    case 5:
                        System.out.println("Escriba el numero");
                        String numero = scanner.next();
                        System.out.println(HexadecimalConversion.hexadecimalToDecimal(numero));
                        break;
                    default:
                        System.out.println("No es una opcion del programa");
                }
            } else {
                System.out.println("Las opciones son numericas");
                scanner.nextLine();
            }
        }
    }
}
