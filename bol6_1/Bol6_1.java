/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_1;

import java.util.Scanner;
/**
 *
 * @author clagosuarez
 */
public class Bol6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        Numero a = new Numero(sc.nextFloat());
        System.out.println(a.convertirPositivo()+" e positivo");
    }
    
}
