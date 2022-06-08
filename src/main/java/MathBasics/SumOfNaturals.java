package MathBasics;

import java.util.Scanner;

public class SumOfNaturals {
    static int somaNúmerosNaturais(int n){
        Integer currentTerm = 0;
        for(int i = 0; i <= n; i++){
            currentTerm = currentTerm + i ;
            System.out.print(i + " | ");
        }
        return currentTerm;
    }
    public static void main(String[] args) {
        Integer n;
            try(Scanner leitor = new Scanner(System.in)){
                System.out.println("Insira o termo da soma dos números naturais que deseja localizar (Nth term): ");
                n = leitor.nextInt();
            }
        Integer nthTerm = somaNúmerosNaturais(n);
        System.out.println("\nA soma dos " + n + " primeiros números naturais é: " + nthTerm);
    }
}
