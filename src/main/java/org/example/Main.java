package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(input1 + input2);
        System.out.println(input1 - input2);
        System.out.println(input1 * input2);
        System.out.println(input1 / input2);
    }
}