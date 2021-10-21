package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество байт: ");

        double x = scanner.nextDouble();
        printBytes(x);
    }

    public static void printBytes(double number) {
        if (number >= 1099511627776.0) {
            System.out.println(String.format("%.1f", number / (1099511627776.0)) + "ТБ");
        } else if (number >= 1073741824) {
            System.out.println(String.format("%.1f", number / (1073741824)) + "ГБ");
        } else if (number >= 1048576) {
            System.out.println(String.format("%.1f", number / (1048576)) + "МБ");
        } else if (number >= 1024) {
            System.out.println((number / 1024) + "КБ");
        } else
            System.out.println(number + "Б");
    }
}
