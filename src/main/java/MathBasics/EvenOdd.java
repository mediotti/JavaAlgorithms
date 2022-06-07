package MathBasics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Float number, result;
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("Insira um número inteiro para descobrir se é um número par ou ímpar: ");
            number = leitor.nextFloat();
        }
        result = number % 2;
            if (result != 0){
                System.out.println("O número é ímpar.");
            }else{
                System.out.println("O número é par.");
            } 

    }
}
