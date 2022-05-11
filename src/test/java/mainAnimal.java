import Animals.Dogs;
import Animals.Fish;

public class mainAnimal {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Fish f = new Fish();

        d.setPesoKg(7);
        d.setGenero('F');

        System.out.println("Especie do Animal: " + d.getEspecie());
        System.out.println("Peso do Animal: " + d.getPesoKg() + " Kg");
        System.out.println("Gênero do Animal: " + d.getGenero());
        d.comunicar();
        d.locomover();

        System.out.println("\nEspecie do Animal: " + f.getEspecie());
        f.locomover();
        f.comunicar();

    }
}
