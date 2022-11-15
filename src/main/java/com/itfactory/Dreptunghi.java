package com.itfactory;

public class Dreptunghi implements CalculP{

    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double perimetru() {
        return 2*(latime + lungime);
    }
}
