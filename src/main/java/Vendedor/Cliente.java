/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vendedor;

/**
 *
 * @author ferch
 */
public class Cliente {
    private Integer codigo;
    private String nombre;
    private Tarjeta tarjeta;
    private Vendedor vendedor;

    public Cliente() {
        vendedor = new Vendedor();
    }

    public Cliente(Integer codigo, String nombre, Tarjeta tarjeta, Vendedor vendedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        vendedor = new Vendedor();
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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    @Override
    public String toString(){
        return "Cliente{"+"Codigo="+codigo+", nombre="+nombre+","
               +"Tarjeta="+tarjeta+","
               +"vendedor="+vendedor + "}";
    }
    
}
