import java.util.ArrayList;
import java.util.List;

public class Flota {
    //composición entre avión y flota.
    private List<Avion> aviones = new ArrayList<>();
    public void agregarAvion(Avion avion){
        aviones.add(avion);
    }
}
