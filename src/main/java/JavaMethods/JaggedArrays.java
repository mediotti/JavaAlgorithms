package JavaMethods;


//Jagged arrays are basically arrays with different types of ranges.
public class JaggedArrays {
    public static void main(String[] args) {
        //Declaring 2d array;
        int bidimensionalArray [][] = new int [2][];
            //Defining the created array as a jagged array;
            bidimensionalArray[0] = new int[5];
            bidimensionalArray[1] = new int[4];
            
            int count = 0;
            for(int i = 0; i < bidimensionalArray.length; i++){
                for(int j = 0; j < bidimensionalArray[i].length; j++){
                    bidimensionalArray[i][j] = count++;
                }
            }
            for(int i = 0; i < bidimensionalArray.length; i++){
                for(int j = 0; j < bidimensionalArray[i].length; j++){
                    System.out.print(bidimensionalArray[i][j] + " ");
                }
                System.out.println();
            }
    }   
}