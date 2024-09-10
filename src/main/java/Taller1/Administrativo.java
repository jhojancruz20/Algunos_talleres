/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author ferch
 */
public class Administrativo extends Persona{
    //Atributoss
    private int añoIngreso;
    private int año=2024;
    
    //Constructor
    public Administrativo(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
    //Metodos
    public void CalcularAmbiguedad(){
        if(añoIngreso <= año){
            int ambiguedad = año - añoIngreso;
            System.out.println(ambiguedad);
        }else{
            System.out.println("Año incorrecto");
        }
    }
    
}
