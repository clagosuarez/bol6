/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_1;

/**
 *
 * @author clagosuarez
 */
public class Numero {
    
    private float num;

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
    public float convertirPositivo(){
        num = Math.abs(num);
        return num;
    }
}
