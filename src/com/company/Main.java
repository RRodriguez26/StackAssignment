package com.company;

/* Rafael Rodriguez
*  February 23th, 2021
*  Professor Chuck Herbert
* Stackies
*/



public class Main {

    public static void main(String[] args) {

        Stackies newStack = new Stackies();

        //A string array for cities
        String[] cities = { "Philadelphia, PA",
                "Harrisburg, PA",
                "Pittsburgh, PA",
                "Cleveland, OH",
                "Toledo, OH",
                "Gary, IN",
                "Chicago, IL" };

        System.out.println("Original data");
        System.out.println("*****************");
        //Iterate city data, and also original source
        for (String s : cities) {
            System.out.println(s);
        } // End enhanced for loop

        //An enhanced for loop that pushes each city into stack
        for (String city : cities) {
            newStack.push(city);
        } //End enhanced for loop

        //A new line
        System.out.println("\nReversed data using stacks");
        System.out.println("*****************");

        //A for loop that pop the stack and reverses the data
        for(int k = 0; k < cities.length; k++){
            cities[k] = newStack.pop(); //
            System.out.println(cities[k]);
        } //End for loop

    } //End main method

}// End class main
