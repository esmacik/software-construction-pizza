package state_machine;

import java.util.Scanner;

class Test{
   public static void main(String[] args) {
    var order = new PizzaOrder();
    System.out.println();


    System.out.println("Status: " + order.getState());
    System.out.println();
    //order.getState();

    order.received();
    System.out.println("Status: " + order.getState());
    System.out.println();

    order.completed();
    System.out.println("Status: " + order.getState());
    System.out.println();

    Scanner scnr = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Order for: \n 1- Eat In \n 2- Carry Out \n 3- Delivery");
    int instructions = scnr.nextInt();

    if(instructions == 1)
        order.orderE();
    else if(instructions == 2)
        order.orderC();
    else if (instructions == 3)
        order.orderD();
    System.out.println("Status: " + order.getState());
    }
}