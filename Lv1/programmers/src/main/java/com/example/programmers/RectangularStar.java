package com.example.programmers;

import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = 0; n < b; n++) {
            for (int m = 0; m < a; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
