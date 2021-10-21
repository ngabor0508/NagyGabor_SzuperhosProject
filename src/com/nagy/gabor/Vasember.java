package com.nagy.gabor;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember(double szuperero, boolean vanEGyengesege) {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if(this.getSzuperero() > 1000){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void kutyutKeszit() {
        this.getSzuperero();
        setSzuperero(Math.random() * 10);
    }
}
