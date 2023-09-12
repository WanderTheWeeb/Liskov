package GoodLisvok;

public class Elefante extends  HeavyAnimal{
    public Elefante(String nombre, String habitat, String peso) {
        super(nombre, habitat, peso);
    }

    public void LanzarAgua(){
        System.out.println("El elefante recoge agua con su trompa y la lanza");
    }
}
