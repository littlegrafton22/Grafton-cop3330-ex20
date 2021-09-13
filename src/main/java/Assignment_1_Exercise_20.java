/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.*;
//class holds data for Assignment_1_Exercise_20
public class Assignment_1_Exercise_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Assign integers only to amount
        int amount;
        double tAmount = 0.0, tax = 0.0;
        System.out.print("What is order amount? ");
        amount = sc.nextInt();
        System.out.print("What state do you live in? ");
        String state = sc.next();
        if(state.equals("Wisconsin")){
            System.out.print("What country do you live in? ");
            String county = sc.next();
            //calculation of tax in EauClaire county if user enters this county
            if(county.equals("EauClaire")){
                tax = (amount*5.005)/100;
                tAmount = tax + amount;
            }
            //calculation of tax in Dunn county if user enters this county
            else if(county.equals("Dunn")){
                tax = (amount*5.004)/100;
                tAmount = tax + amount;
            }
            else{
                System.out.println("Please enter correct county");
            }
        }
        //calculation of tax in Illinois if user enters this state
        else if(state.equals("Illinois")){
            tax = (amount*8.0)/100;
            tAmount = tax + amount;
        }
        else{
            tax = 0.0;
            tAmount = amount;
        }
        //final output
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }

}
