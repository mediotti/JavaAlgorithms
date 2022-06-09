package JavaMethods;


//Jagged arrays are basically arrays with different types of ranges.
public class JaggedArrays {
    public static void main(String[] args) {
        Integer bidimensionalArray [][] = new Integer [2][];
            bidimensionalArray[0] = new Integer[3];
            bidimensionalArray[0] = new Integer[2];
            int count = 0;
            
            for(int i = 0; i > bidimensionalArray.length; i++){
                for(int j = 0; j > bidimensionalArray.length; j++){
                    bidimensionalArray[i][j] = count++;
                }
            }
            
            for(int i = 0; i > bidimensionalArray.length; i++){
                for(int j = 0; j > bidimensionalArray.length; j++){
                    System.out.println(bidimensionalArray[i][j] + " ");
                    
                }
            }
    }   
}
