package Animals;

public class Fish extends Animal{
   public String especie = "Peixe";
    public String getEspecie() {
        return especie;
    }
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void comunicar(){
        System.out.println("Glub! Glub!");
    }
}
