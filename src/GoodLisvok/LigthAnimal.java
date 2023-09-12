package GoodLisvok;
public class LigthAnimal {
    //Atributos
    String nombre;
    String habitat;
    String peso;

    public LigthAnimal(String nombre, String habitat, String peso) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.peso = peso;
    }

    //Metodos

    public static void Caminar(){
        System.out.println("El animal camina");
    }
    public static void Saltar(){
        System.out.println("El animal salta el agujero");
    }
    public void Agujero(){
        LigthAnimal.Caminar();
        LigthAnimal.Saltar();
        LigthAnimal.Caminar();
    }
}
