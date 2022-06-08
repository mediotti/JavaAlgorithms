package JavaMethods;

import java.util.Arrays;

public class StrLength {
    public static void main(String[] args) {
        String teste = "Gabriel Mediotti";
        String doubleTeste = "1.985";

        System.out.println("Tamanho da String: " + teste.length());
        System.out.println("5o. caracter da String: " + teste.charAt(5));
        String [] split = teste.split(" ");
        System.out.println("String divida e convertida para um array: " + Arrays.toString(split));
    	System.out.println("String em caixa alta: " + teste.toUpperCase());
        System.out.println("Parse String to Double value: " + Double.parseDouble(doubleTeste));
        
	}
}
