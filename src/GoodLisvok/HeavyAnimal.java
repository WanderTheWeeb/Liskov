package GoodLisvok;

import Bad_Liskov.Animal;

public class HeavyAnimal{
    //Atributos
    String nombre;
    String habitat;
    String peso;

    //Canstructaar
    public HeavyAnimal(String nombre, String habitat, String peso) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.peso = peso;
    }
    //Metodos

    public static void Caminar(){
        System.out.println("El animal camina");
    }
    public static void Rodear(){
        System.out.println("El animal rodea el agujero");
    }
    public void Agujero(){
        HeavyAnimal.Caminar();
        HeavyAnimal.Rodear();
        HeavyAnimal.Caminar();
    }
}

