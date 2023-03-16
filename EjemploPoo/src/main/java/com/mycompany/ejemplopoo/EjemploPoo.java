/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplopoo;

/**
 *
 * @author Scott
 */
public class EjemploPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objetos estudiantes
        Estudiante estudiante01 = new Estudiante();
        Estudiante estudiante02 = new Estudiante();
        Estudiante estudiante03 = new Estudiante();
        
        estudiante01.setNombre("Scott");
        estudiante01.setApellidoPaterno("Angeles");
        estudiante01.setApellidoMaterno("Asto");
        estudiante01.setSexo('M');
        estudiante01.setEdad(19);
        
        estudiante03.setEdad(20);
        
        System.out.println(estudiante01.getNombre());
        System.out.println(estudiante03.getEdad());
    }
            
}
