/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author ferch
 */
public class Estudiante extends Persona{
    //Atri
    private String carrera;
    private int creditosAprobados;
    
    //Cons
    public Estudiante() {
    }

    public Estudiante(String carrera, int creditos) {
        this.carrera = carrera;
        this.creditosAprobados = creditos;
    }

    public Estudiante(String carrera, int creditos, String nombre, String apellido, int codigo) {
        super(nombre, apellido, codigo);
        this.carrera = carrera;
        this.creditosAprobados = creditos;
    }
    //Metodos
    public boolean MatricularGrado(){
        if(creditosAprobados >= 90){
            return true;
        }else{
            return false;
        }
    }
}
