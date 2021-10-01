package com.company;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        System.out.println("Introduce 2 valores para saber el porcentaje de rebaja entre ellos");
        Scanner inputValue = new Scanner(System.in);
        float numero1 = inputValue.nextFloat();
        System.out.println("Introduce el otro valor");
        inputValue = new Scanner(System.in);
        float numero2 = inputValue.nextFloat();
        System.out.println("el descuento es de: " + (numero1 - numero2) / numero1 * 100.0F + "%");
    }
}
