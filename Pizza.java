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
public class Pizza {

        private static int ordernumber;
        private static String meat;
        private static String cheese;
        private static String vegetables;
        private static Double diameter;
    
    public static class Builder {

        private int ordernumber;
        private String meat;
        private String cheese;
        private String vegetables;
        private Double diameter;
        
        
        public Builder(int ordernumber)
        {
            this.ordernumber = ordernumber;           
        }
        
        public Builder withMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder withCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder withVegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Builder hasDiameter(double diameter) {
            this.diameter = diameter;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.ordernumber = this.ordernumber;
            pizza.meat = this.meat;
            pizza.cheese = this.cheese;
            pizza.vegetables = this.vegetables;
            pizza.diameter = this.diameter;
            return pizza;
        }

    }
    
    private Pizza()
    {
        
    }
}
