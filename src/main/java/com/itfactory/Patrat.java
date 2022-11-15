package com.itfactory;

public class Patrat implements CalculP{

   private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public double perimetru() {
        return 2*latura;
    }
}
