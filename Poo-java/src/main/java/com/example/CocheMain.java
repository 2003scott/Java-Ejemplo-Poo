package com.example;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "Alfa romeo";
        //Coche cocheObj = new Coche();

        Coche cocheObj2 =  new CocheElectrico("Rojo","Honda","civic",1430.45,5.4,"");

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante= "Honda";
        cocheElectrico.modelo= "civicc";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Azul","Alfa","Romeo",1500d,4.99,"TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);
    }
}

