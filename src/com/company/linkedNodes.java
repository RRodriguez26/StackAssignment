package com.company;

public class linkedNodes {

    //Global variable
    String city;
    linkedNodes NodePointer;

    //A null constructor
    public linkedNodes() {

        city = null;
        NodePointer = null;
    }

    //A constructor where the method creates a node with data but no pointer
    public linkedNodes(String c) {
        city = c;
        NodePointer = null;
    }

    //A constructor where the method creates a node with data and a pointer
    public linkedNodes(String c, linkedNodes pointer) {
        city = c;
        NodePointer = pointer;
    }

    //return a reference to the node data
    public String getData(){
        return this.city;
    }

    //sets a node data reference
    public void setData(String c){
        this.city = c;
    }

    //returns a node link to the next node
    public linkedNodes getNext(){
        return this.NodePointer;
    }

    //Sets a node's link to the next node
    public void setNext(linkedNodes NodePointer){
        this.NodePointer = NodePointer;
    }

}
