package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        String a = input.nextLine();
        int c=Integer.valueOf(a);
        System.out.print("Enter num2 = ");
        String b = input.nextLine();
        int d=Integer.valueOf(b);
        add(c,d);
    }
    public static void add(int a, int b){
        System.out.print("Result = " + (a+b));
    }
}
