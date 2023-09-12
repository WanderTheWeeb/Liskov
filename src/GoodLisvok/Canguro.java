package GoodLisvok;

public class Canguro extends LigthAnimal{
    public Canguro(String nombre, String habitat, String peso) {
        super(nombre, habitat, peso);
    }

    public void Golpear(){
        System.out.println("El canguro golpea");
    }

    public static void saltar(){
        System.out.println("El canguro salta");
    }
    @Override
    public void Agujero() {
        LigthAnimal.Caminar();
        Canguro.Saltar();
        LigthAnimal.Caminar();
    }
}
