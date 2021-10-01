package com.company;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        double PI = 3.14159D;
        System.out.println("Introduce el valor del radio de una circunferencia");
        Scanner inputValue = new Scanner(System.in);
        float radio = inputValue.nextFloat();
        System.out.println("El area es: " + (PI * (double)radio * (double)radio));
        System.out.println("Su perimetro es: " + (PI * (double)radio * 2.0D));
    }
}
