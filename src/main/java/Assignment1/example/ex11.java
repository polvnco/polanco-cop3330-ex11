/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex11
{
    public static void main( String[] args )
    {
        System.out.print( "How many euros are you exchanging? " );
        Scanner euros = new Scanner(System.in);
        String euroAmount = euros.nextLine();

        System.out.print( "What is the exchange rate? " );
        Scanner exchangeRate = new Scanner(System.in);
        float c_to = exchangeRate.nextFloat();

        float c_from = Integer.parseInt(euroAmount);
        float rate = c_to * c_from;

        System.out.println((int) c_from + " euros at an exchange rate of " + c_to + " is\n" + String.format("%.2f", rate) + " U.S. dollars.");
    }
}
