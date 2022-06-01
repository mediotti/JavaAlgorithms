package JavaMethods;

import java.io.*;


public class DocuReader {
    public static void leitor() throws IOException{
	String filePath = "/home/medzdev/teste-intellij/teste-intellij/src/main/resources/teste.txt";
	    BufferedReader leitor = new BufferedReader( new FileReader(filePath));
        String linha = leitor.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = leitor.readLine();
            }
            leitor.close();
    }
    public static void main(String[] args) throws IOException {
        leitor();
    }
}
