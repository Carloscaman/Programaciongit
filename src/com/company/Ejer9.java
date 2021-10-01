package com.company;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        System.out.println("Introduce un valor para ver si es par o impar");
        Scanner inputValue = new Scanner(System.in);
        int valor = inputValue.nextInt();
        if (valor % 2 == 0) {
            System.out.println("El valor es par");
        }

        if (valor % 2 == 1) {
            System.out.println("El valor es impar");
        }
    }
}
