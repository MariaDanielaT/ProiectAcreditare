package com.itfactory;

public class Triunghi implements CalculP{

    private double laturaAB;
    private double laturaBC;
    private double laturaCA;

    public Triunghi(double laturaAB, double laturaBC, double laturaCA) {
        this.laturaAB = laturaAB;
        this.laturaBC = laturaBC;
        this.laturaCA = laturaCA;
    }

    @Override
    public double perimetru() {
        return laturaCA + laturaBC + laturaAB;
    }
}
