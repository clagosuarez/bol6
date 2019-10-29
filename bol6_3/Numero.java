/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_3;

/**
 *
 * @author clagosuarez
 */
public class Numero {
    private float num;
    private String valor;

    public Numero() {
    }

    public Numero(float num) {
        this.num = num;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }
    public String condicional(){
        if (num > 0) {
            valor = "+";
        }
        else if(num < 0){
            valor = "-";
        }
        else{
            valor = "0";
        }
        return valor;
    }
}
