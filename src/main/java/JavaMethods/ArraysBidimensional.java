package JavaMethods;

import java.util.Arrays;

public class ArraysBidimensional {
    public static void main(String[] args) {
        String[][] arrayBidimensional = {{"Nome", "Gabriel"}, {"Nome", "Giulia"}};
            for (int i = 0; i<2; i++){
                for (int j = 0; j<2; j++){
                    System.out.println(arrayBidimensional[i][j] + " ");
                }
            }

            //System.out.println(arrayBidimensional[0][1]);
    }
}
