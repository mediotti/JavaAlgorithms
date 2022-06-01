package JavaMethods;

import java.io.*;
import java.util.Scanner;

public class DocuWriter {
    public static void escritor() throws IOException {
        String filePath = "/home/medzdev/teste-intellij/teste-intellij/src/main/resources/teste.txt";
        BufferedWriter escritor = new BufferedWriter(new FileWriter(filePath));
        
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Escreva alguma coisa: ");
            String linha = userInput.nextLine();
            escritor.append(linha + "\n");
        }

        escritor.close();

    }
    public static void main(String[] args) throws IOException {
        escritor();
    }
}
