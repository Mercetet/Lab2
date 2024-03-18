//Herencia entre  piloto y persona e implementación entre la clase piloto y la interface Volador
public class Piloto extends Persona implements Volador{
    @Override
    public void volar() {
        System.out.println("El piloto vuela. ");
    }
}
