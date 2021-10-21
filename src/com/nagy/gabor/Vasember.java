package com.nagy.gabor;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember(double szuperero, boolean vanEGyengesege) {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return false;
    }

    @Override
    public void kutyutKeszit() {
        this.getSzuperero();
        setSzuperero(Math.random() * 10);
    }
}
