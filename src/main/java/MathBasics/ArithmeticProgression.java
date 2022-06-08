package MathBasics;

import java.util.Scanner;

public class ArithmeticProgression {
    static int progressãoAritmetica(int a, int d, int n){
        Integer currentTerm = a;
        System.out.print("\n" + a + " | ");
        for(int i = 0; i < n; i++){
            currentTerm = currentTerm + d;
            System.out.print(currentTerm + " | ");
        }
        return currentTerm;
    }
    public static void main(String[] args) {
        Integer a, d, n;
            try(Scanner leitor = new Scanner(System.in)){
                System.out.println("Insira o primeiro termo da progressão aritmética: ");
                a = leitor.nextInt();

                System.out.println("Insira a razão da progressão aritmética: ");
                d = leitor.nextInt();

                System.out.println("Insira o termo da progressão aritmética que deseja localizar (Nth term): ");
                n = leitor.nextInt();
            }
        Integer nthTerm = progressãoAritmetica(a, d, n);
        System.out.println("\nO termo localizado no(a) " + n + " posição da Progressão Aritmética é: " + nthTerm);
        
        /*Integer nthTerm = a + (n - 1) * d;
            System.out.println("O termo localizado na " + n + ".a/.o posição da Progressão Aritmética é: " + nthTerm); */
    }
}
