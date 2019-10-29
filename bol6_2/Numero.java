/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_2;

/**
 *
 * @author clagosuarez
 */
public class Numero {
    private short num1;
    private short num2;
    private float suma;
    private float resta;
    
    public Numero() {
    }

    public Numero(short num1, short num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public short getNum1() {
        return num1;
    }

    public void setNum1(short num1) {
        this.num1 = num1;
    }

    public short getNum2() {
        return num2;
    }

    public void setNum2(short num2) {
        this.num2 = num2;
    }
    
    public void operaciones(){
        if (num1 >= num2) {
            resta = num1 - num2;
            System.out.println("El resultado de la resta es "+resta);
        }
        suma = num1 + num2;
        System.out.println("El resultado de la suma es "+suma);
    }
}
