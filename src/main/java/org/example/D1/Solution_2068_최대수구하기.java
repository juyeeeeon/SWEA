package org.example.D1;

import java.util.Scanner;

public class Solution_2068_최대수구하기 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);


        String input = sc.next();
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result += Integer.parseInt(input.substring(i, i + 1));
        }
        System.out.println(result);

    }
}
