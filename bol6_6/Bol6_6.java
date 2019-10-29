/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_6;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe el número de ventas de un producto:");
        Scanner sc = new Scanner(System.in);
        Producto product = new Producto(sc.nextInt());
        System.out.println(product.clasificarTipo());
    }
    
}
