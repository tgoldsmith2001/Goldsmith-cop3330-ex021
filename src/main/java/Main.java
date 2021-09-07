/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String holder;
        int num_month;
        while(true) {
            try {
                System.out.print("Please enter the number of the month: ");
                holder = input.nextLine();
                num_month = Integer.parseInt(holder);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                continue;
            }
        }
        System.out.format("The name of the month is %s",get_month(num_month));
    }
    static String get_month(int n){
        switch(n){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return"March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return"Invalid Number";
    }
}
