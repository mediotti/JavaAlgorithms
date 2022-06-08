package Animals;

import UserInfo.CostumerInfo;

public class mainAnimal {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Fish f = new Fish();
        CostumerInfo usr = new CostumerInfo();

        d.setPesoKg(7);
        d.setGenero('F');

        usr.setAge(20);
        usr.setGender('M');
        usr.setcostumerName("Gabriel Mediotti Marques");

        System.out.println("Username: " + usr.getcostumerName());
        System.out.println("Gender: " + usr.getGender());
        System.out.println("Age: " + usr.getAge());

        System.out.println("\nEspecie do Animal: " + d.getEspecie());
        System.out.println("Peso do Animal: " + d.getPesoKg() + " Kg");
        System.out.println("Gênero do Animal: " + d.getGenero());
        d.comunicar();
        d.locomover();

        System.out.println("\nEspecie do Animal: " + f.getEspecie());
        f.locomover();
        f.comunicar();

    }
}
