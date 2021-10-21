package com.nagy.gabor;

public class Batman implements Szuperhos, Milliardos{

    private double lelemenyesseg;

    public Batman(double lelemenyesseg) {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyzoziE(Szuperhos s) {
       if (s.mekkoraAzEreje() < this.lelemenyesseg){
           return true;
       }
       else{
           return false;
       }
    }

    @Override
    public double mekkoraAzEreje() {
        return 0;
    }

    @Override
    public String toString() {
        return "Batman leleményessége: " + lelemenyesseg;
    }
}
