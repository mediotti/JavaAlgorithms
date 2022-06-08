package OOP;


import java.util.*;

public class LinkedListTeste {
    public static void main(String[] args) {
        LinkedList<String> listaLinkada = new LinkedList();
        listaLinkada.addLast("OLA MUNDO!");
        listaLinkada.addLast("OLa MuNdO!!");
        System.out.println(listaLinkada);
        Collections.replaceAll(listaLinkada, "OLA MUNDO!", "Oiiiiii");
        System.out.println("\n\n" + listaLinkada);
    }
}
