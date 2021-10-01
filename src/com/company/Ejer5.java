package com.company;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        System.out.println("Introduce dos numeros enteros los cuales se sumaran, restaran, multiplicaran y dividiran.");
        Scanner inputvalue1 = new Scanner(System.in);
        int numero1 = inputvalue1.nextInt();
        System.out.println("Introduce el otro numero entero");
        inputvalue1 = new Scanner(System.in);
        int numero2 = inputvalue1.nextInt();
        System.out.println("El resultado de la suma es: " + (numero1 + numero2));
        System.out.println("El resultado de la resta es: " + (numero1 - numero2));
        System.out.println("El resultado de la multiplicacion es: " + numero1 * numero2);
        System.out.println("El resultado de la division es: " + numero1 / numero2);
    }
}
