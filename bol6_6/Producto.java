/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_6;

/**
 *
 * @author clagosuarez
 */
public class Producto {
    private int venta;
    private String articulo;

    public Producto() {
    }

    public Producto(int venta) {
        this.venta = venta;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }
    
    public String clasificarTipo(){
        if(venta <= 100){
            articulo = "baixo";
        }
        else if (venta>100 && venta<=500){
            articulo = "medio";
        }
        else if (venta>500 && venta<=1000){
            articulo = "alto";
        }
        else{
            articulo = "primeira necesidade";
        }
        return articulo;
    }
}
