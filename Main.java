package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[][] = new int[t][2];
        int arrDigit = 0;
        for (int i = 0; i < t; i++) {
            arr[i][0] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < String.valueOf(arr[i][0]).length(); j++) {
                arrDigit = Integer.parseInt(Integer.toString(arr[i][0]).substring(j,j+1));
                if (arrDigit != 0) {
                    if (arr[i][0] % arrDigit == 0) {
                        arr[i][1] = arr[i][1] + 1;
                    }
                }
//                System.out.println(arrDigit + " || i " + i + " || j " + j);
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i][1]);
        }
    }
}
