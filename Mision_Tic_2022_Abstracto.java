package mision_tic_2022_abstracto;
public class Mision_Tic_2022_Abstracto {
    public static void main(String[] args) {
        Planta rosa = new Planta ();
        rosa.alimentarse();
        AnimalCarnivoro leon = new AnimalCarnivoro ();
        leon.alimentarse();
        AnimalHerbivoro conejo = new AnimalHerbivoro();
        conejo.alimentarse();
    }
    
}
