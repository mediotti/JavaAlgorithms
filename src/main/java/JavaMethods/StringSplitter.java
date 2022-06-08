package JavaMethods;

import java.util.Arrays;

public class StringSplitter {
    public static void main(String[] args) {
        String info = "Gabriel Mediotti, 20, Male, Brazilian";
        String [] splittedString = info.split(", ");
        System.out.println(Arrays.toString(splittedString));

    }
}
