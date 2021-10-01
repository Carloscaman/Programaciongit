package com.company;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        System.out.println("Introduce tu edad");
        Scanner inputValue = new Scanner(System.in);
        int edad = inputValue.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }

        if (edad < 18) {
            System.out.println("No es mayor de edad.");
        }
    }
}
