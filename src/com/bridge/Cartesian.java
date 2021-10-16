package com.bridge;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Cartesian {
    public static int LINE1 =0;
    public static int LINE2 =0;
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Cartesian cart = new Cartesian();
        cart.calc();
        cart.calc2();
        cart.equality();
    }
    public void equality (){
        if (LINE1 > LINE2) {
            System.out.println("Line1 is greater than Line2");
        }else if (LINE1<LINE2) {
            System.out.println("Line2 is greater than Line1");
        }else {
            System.out.println("Lines are equal");
        }
    }

    public void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1:");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y2:");
        int y2 = sc.nextInt();
        LINE1 = (int) Math.sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        System.out.println("Distance :" + LINE1);
    }

    public static void calc2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a1:");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of b1:");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of a2:");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b2:");
        int b2 = sc.nextInt();
        LINE2 = (int) Math.sqrt(pow(a2 - a1, 2) + pow(b2 - b1, 2));
        System.out.println("Distance :" + LINE2);
    }

}