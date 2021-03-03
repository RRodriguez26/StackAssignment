package com.company;

public class queue {

    //Properties
    private linkedNodes head, tail;
    private int size;


    //Null constructor method
    public queue() {
        this.head = this.tail = null;
        size = 0;
    }


    //Enqueue method to add an item to queue to the tail
    public void enqueue(String data) {

        linkedNodes temp = new linkedNodes(data);

        if (this.tail == null) { //If first item entered, it will be the head and the tail
            this.head = this.tail = temp;
        }

        tail.setNext(temp);
        this.tail = temp; //set temp into tail

        size++; //Size is increased

        //Prints out item added and the size
        System.out.println(tail.getData() + " being added, queue size = " + getCount());
    }

    //Dequeue method to remove the item from the head
    public void dequeue() {

        size--; //Size decreased

        //Prints out item removed and the size
        System.out.println(head.getData() + " removed, queue size = " + getCount());


        linkedNodes temp = this.head;
        this.head = this.head.getNext();

        if (isEmpty()) { //If head is empty, then the tail is empty
            this.tail = null;
        }

    }

    //A boolean expression to check if queue is empty
    public Boolean isEmpty() {

        //Returns true if size is less than one and it is considered empty
        //otherwise it is not empty
        if (size < 1){

            System.out.println("The queue is now empty");
            return true;

        } else {

            return false;

        }

    }//End isEmpty

    //A method to count the amount of items there are in queue
    public int getCount() {

        return size; //returns the amount of nodes in a queue

    } //Ends getCount

    //A method to search the item in queue
//    public String search(){
//
//    }
}
