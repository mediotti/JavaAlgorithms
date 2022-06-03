package JavaMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CsvToArray {
    public static void leitor() throws IOException {
        String filePath = "/home/medzdev/teste-intellij/teste-intellij/src/main/resources/PersonInfo.csv";
        String splitBy = ",";
        String line = "";

    //Using while, this will recreate the array every time the line ends, and print a new personInfo array from the new loop.

        try{
            BufferedReader leitor = new BufferedReader( new FileReader(filePath));
            while((line = leitor.readLine()) != null){
                //The while condition says that: while the method readline returns something, it'll keep repeating the loop, otherwise, it'll break.
                //The information read from the file is going to the line variable,
                String[] personInfo = line.split(splitBy);
                //Creating the string array called personInfo, this receives the content of "line" variable.
                //The line.split method splits the main string in multiples strings, given the delimiter.
                System.out.println(Arrays.toString(personInfo));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {
        leitor();
    }
}
