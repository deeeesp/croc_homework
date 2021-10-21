package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.println("Введите массив ");
        for(int i=0; i< arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        sortArray(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortArray(int arr[]) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
                    swapElement(arr, j, j + 1);
            }
        }
        return result;
    }

    private static void swapElement(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
