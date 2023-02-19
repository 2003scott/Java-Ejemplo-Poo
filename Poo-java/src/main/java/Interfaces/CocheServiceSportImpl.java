package Interfaces;

import Interfaces.CocheService;
import com.example.Coche;
import com.example.CocheElectrico;

public class CocheServiceSportImpl  implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creado coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruye coche");
    }
}
