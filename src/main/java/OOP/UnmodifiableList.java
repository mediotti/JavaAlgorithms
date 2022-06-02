package OOP;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnmodifiableList {
    private final List<Integer> numbers = new LinkedList<>();

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public void addNumbers(Integer number2Add){
        numbers.add(number2Add);
    }

    public static void main(String[] args) {
        UnmodifiableList listaImodificavel = new UnmodifiableList();
        listaImodificavel.addNumbers(25);
        System.out.println(listaImodificavel.getNumbers());
    }
}
