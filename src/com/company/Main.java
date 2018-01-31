package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    String time1, time2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter time #1 (mm:ss): ");
        time1 = keyboard.nextLine();

        System.out.print("Enter time #2 (mm:ss): ");
        time2 = keyboard.nextLine();

        TimeDifference diff = new TimeDifference(time1, time2);
        diff.Difference();
    }
}
