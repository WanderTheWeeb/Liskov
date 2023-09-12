package Bad_Liskov;

public class Elephant extends Animal {



    public Elephant(String nombre, String habitat, String peso) {
        super(nombre, habitat, peso);
    }

    @Override
    public void SaltarAgujero() {
        System.out.println("Los elefantes no pueden saltar");
    }


}
