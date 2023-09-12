package Bad_Liskov;

public class Animal {
    //Atributos
    String nombre;
    String habitat;
    String peso;

    //Constructor
    public Animal(String nombre, String habitat, String peso) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.peso = peso;
    }

    //Metodos
    public static void caminar(){
        System.out.println("El animal camina");
    }
    public static void saltar(){
        System.out.println("El animal salta la zanja");
    }
    public void SaltarAgujero(){
        Animal.caminar();
        Animal.saltar();
        Animal.caminar();
    }

}
