public class AbstractionMainClass {
    public static void main(String[] args) {
        Abstraction obj = new Abstraction();
        obj.setIdade(20);
        obj.setNome("Gabriel Mediotti Marques");
        System.out.println("Nome: " + obj.getNome());
        System.out.println("Idade: " + obj.getIdade());
    }
}
