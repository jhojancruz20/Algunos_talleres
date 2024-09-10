/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author ferch
 */
public class Docente extends Persona{
    //Atri
    private String profesion;
    private int salario;
    private double peso, estatura;
    
    //Constructor

    public Docente() {
    }

    public Docente(String profesion, int salario, double peso, double estatura) {
        this.profesion = profesion;
        this.salario = salario;
        this.peso = peso;
        this.estatura = estatura;
    }

    public Docente(String profesion, int salario, double peso, double estatura, String nombre, String apellido, int codigo) {
        super(nombre, apellido, codigo);
        this.profesion = profesion;
        this.salario = salario;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    //Metodos
    public void CalcularIMC(){
        double imc = peso/estatura;
        System.out.println(imc);
    }
    
}
