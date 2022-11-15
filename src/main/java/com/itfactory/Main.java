package com.itfactory;

public class Main {
    public static void main(String[] args) {

        CalculP dreptunghi = new Dreptunghi(2.3, 4.3);

        System.out.println("Perimetrul dreptunghiului este : " + dreptunghi.perimetru());

        CalculP triunghi = new Triunghi(2.2, 4.3, 3.4);

        System.out.println("Perimetrul triunghiului este : " + triunghi.perimetru());

        CalculP patrat = new Patrat(2.2);

        System.out.println("Perimetrul patratului este : " + patrat.perimetru());

    }
}