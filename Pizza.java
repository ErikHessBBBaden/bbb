/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.BuilderPattern;

/**
 *
 * @author Schule
 */
class Pizza {

    private static int ordernumber;
    private static String meat;
    private static String cheese;
    private static String vegetables;
    private static Double diameter;
    

    public Pizza(int ordernumber) {

    }

    public Pizza withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public Pizza withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public Pizza withVegetables(String vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    public Pizza hasDiameter(double diameter) {
        this.diameter = diameter;
        return this;
    }
}
