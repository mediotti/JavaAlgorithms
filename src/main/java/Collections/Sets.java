package Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
        public static void main(String[] args) {
            Set<Integer> integerSet = new HashSet<>();
                integerSet.add(10);
                integerSet.add(20);
                integerSet.add(30);
                    if(integerSet.remove(20)){
                        System.out.println("O número 20 existe no Set e foi removido!");
                    }

        }
    }
