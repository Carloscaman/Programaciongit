package com.company;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        System.out.println("Enter the side:");
        Scanner inputValue = new Scanner(System.in);
        float side = inputValue.nextFloat();
        float squareArea = side * side;
        System.out.println(squareArea);
    }
}
