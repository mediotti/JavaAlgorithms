package Animals;

public class Dogs extends Animal{
   public String especie = "Cachorro";

    public String getEspecie() {
        return especie;
    }
   @Override
    public void locomover(){
       System.out.println("Correndo");
   }

   @Override
    public void comunicar(){
       System.out.println("Au! Au!");
   }
}
