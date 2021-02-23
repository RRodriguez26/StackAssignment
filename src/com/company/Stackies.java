package com.company;

public class Stackies {

    //Instantiated two properties
    String[] stack = new String[7];
    int top = -1;

    //Push method
    void push(String city) {

        //Conditional if statement to check if the stack is full
        if (top < stack.length - 1) {

            stack[top + 1] = city; //Adds the city into the stack
            top++; //move on to the next index

        } else {

            System.out.println("The stack is full");
        }

    }//End push

    //Pop Method
    String pop() {

        String city;

        if (top >= 0) {

            city = stack[top]; //removes a item from the top of the stack
            top--; //next stack

        } else {

            System.out.println("The stack is empty");
            city = null; //returns nothing if theres no more item

        }

        return city; //returns a string

    }//end pop method

}//end Stackies class
