package MathBasics;

import java.util.Scanner;

public class FirstAndLastDigits {
    static Integer firstNumber(int number){
        while (number >= 10){
            number = number/10;
        }
        return number;
    }
    public static void main(String[] args) {
        Integer number, firstDigit, lastDigit;
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("Insira o número que deseja localizar o primeiro e último dígito: ");
                number = leitor.nextInt();
        }
        lastDigit = number % 10;
        firstDigit = firstNumber(number);

        System.out.println("\nNúmero inserido: " + number);
        System.out.println("\nPrimeiro dígito: " + firstDigit);
        System.out.println("\nÚltimo dígito: " + lastDigit);
    }
}
