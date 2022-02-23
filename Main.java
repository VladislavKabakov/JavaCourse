package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Guess a number from 0 to 2^31 - 1");
        Scanner in = new Scanner(System.in);
        double left_boarder = 0, right_boarder = Math.pow(2, 31);
        while (true) {
            double middle = Math.floor((left_boarder + right_boarder) / 2);
            System.out.printf("Tell if %.1f is less than your number (0) or greater (1) or equal to (2) \n", middle);
            double input = in.nextDouble();
            if (input == 0) {
                left_boarder = middle - 1;
            }
            else if (input == 1){
                right_boarder = middle + 1;
            }
            if (input == 2) {
                System.out.println("Your number is " + middle);
                break;
            }
        }
    }
}
