/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vendedor;

/**
 *
 * @author ferch
 */
public class Vendedor {
    private Integer codigo;
    private String nombre;

    Vendedor() {
    }

    public Vendedor(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }



    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Vendedor {" + "codigo=" + codigo + ", nombre=" + nombre + "'}";
    }
        
    
}
