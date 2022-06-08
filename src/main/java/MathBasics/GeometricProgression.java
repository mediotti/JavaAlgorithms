package MathBasics;

import java.util.Scanner;

public class GeometricProgression {
    static int progressãoGeométrica(int a, int q, int n){
        Integer currentTerm = a;
        System.out.print("\n" + a + " | ");
        for(int i = 0; i < n; i++){
            currentTerm = currentTerm * q;
            System.out.print(currentTerm + " | ");
        }
        return currentTerm;
    }
    public static void main(String[] args) {
        Integer a, q, n;
            try(Scanner leitor = new Scanner(System.in)){
                System.out.println("Insira o primeiro termo da progressão geométrica: ");
                a = leitor.nextInt();

                System.out.println("Insira a razão da progressão geométrica: ");
                q = leitor.nextInt();

                System.out.println("Insira o termo da progressão geométrica que deseja localizar (Nth term): ");
                n = leitor.nextInt();
            }
        Integer nthTerm = progressãoGeométrica(a, q, n);
        System.out.println("\nO termo localizado no(a) " + n + " posição da Progressão Geométrica é: " + nthTerm);
    }
}
