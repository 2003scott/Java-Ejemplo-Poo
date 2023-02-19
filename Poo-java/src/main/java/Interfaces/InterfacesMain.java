package Interfaces;

import com.example.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImpl();
        Coche coche = service.crearCocheDemo();
    }

}
