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
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza pizza = new Pizza.Builder(391872).withMeat("Ham").withCheese("Raclette").withVegetables("Broccoli").hasDiameter(30).build();
        
    }
    
}