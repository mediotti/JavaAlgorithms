package JavaMethods;

import java.io.*;
import java.util.Scanner;

public class InputToCsv {

    public static void writer() throws IOException {
        String filePath = "/home/medzdev/teste-intellij/teste-intellij/src/main/resources/PersonInfo.csv";
        Integer option;
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        try (Scanner terminalInput = new Scanner(System.in)){
            do {
                option = 0;
                System.out.println("Escreva o nome a ser inserido no arquivo: ");
                String linha = terminalInput.nextLine();
                writer.append(linha);

                System.out.println("Deseja adicionar outro nome? (1) Sim | (2) Não: ");
                option = terminalInput.nextInt();
                    
                switch(option){
                
                case 1: writer.append(", ");    //Defining the delimiter, in .csv, the information is delimitted by comma (,).
                    break;
                default: writer.append("\n");   //Adding a line break after de last name.
                    break;
            }
                terminalInput.nextLine();   //This will skip the /n kept after the enter.
            } while (option == 1);
        }

        writer.close();
    }

    public static void main(String[] args) throws IOException {
        writer();
    }
}
