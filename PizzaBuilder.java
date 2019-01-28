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
public class PizzaBuilder extends MyBuilder{

    private int ordernumber;
    private String meat;
    private String cheese;
    private String vegetables;
    private Double diameter;

    public PizzaBuilder(int ordernumber, String meat, String cheese, String vegetables, Double diameter) {
        this.ordernumber = ordernumber;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.diameter = diameter;
    }

    
    
    

    @Override
    public Pizza build() {
        Pizza pizza = new Pizza(ordernumber).withMeat(meat).withCheese(cheese).withVegetables(vegetables).hasDiameter(diameter);          
        return pizza;
    }
    
}
