package Animals;

public class Animal {
    public String especie;
    protected char genero;
        public void setGenero(Character genero) {
            this.genero = genero;
        }
        public Character getGenero() {
        return genero;
    }
    protected int pesoKg;
        public void setPesoKg(int pesoKg) {
            this.pesoKg = pesoKg;
        }
        public int getPesoKg(){
            return pesoKg;
        }
    void locomover(){}
    void dormir(){}
    void comunicar(){}
}
