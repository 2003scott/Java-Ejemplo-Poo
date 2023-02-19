package Interfaces;

import Interfaces.CocheService;
import com.example.Coche;
import com.example.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creado coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }


}
