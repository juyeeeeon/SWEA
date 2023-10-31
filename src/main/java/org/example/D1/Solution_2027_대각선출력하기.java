package org.example.D1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_2058_자릿수더하기 {
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
