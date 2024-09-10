/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vendedor;

/**
 *
 * @author ferch
 */
public class Agregacion {
    private Cliente cliente;
    

    public Agregacion(){
        this.cliente = cliente;
    }
    
    public void cargar(){
        cliente.setCodigo(3);
        cliente.setNombre("Claudia");
        
        //Carga
        Tarjeta tarjeta = new Tarjeta();
        
        tarjeta.setCodigo(2);
        tarjeta.setLimite(2D);
        
        cliente.setTarjeta(tarjeta);
        
        //Carga
        cliente.getVendedor().setCodigo(5);
        cliente.getVendedor().setNombre("jhojan");
        
    }
    
    public void imprimir(){
        System.out.println(cliente.toString());
    }
    public static void main(String[] args) {
        Agregacion a = new Agregacion();
        a.cargar();
        a.imprimir();
    }
}
