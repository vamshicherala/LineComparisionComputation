package com.bridge;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Cartesian {
        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
            Cartesian cart = new Cartesian();
            cart.calc();
        }
        void calc(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of x1:");
            int x1 = sc.nextInt();
            System.out.println("Enter the value of y1:");
            int y1 = sc.nextInt();
            System.out.println("Enter the value of x2:");
            int x2 = sc.nextInt();
            System.out.println("Enter the value of y2:");
            int y2 = sc.nextInt();
            int distance = 0;
            distance = (int) Math.sqrt(pow(x2-x1,2)+ pow(y2-y1,2));
            System.out.println("Distance :"+distance);
        }
    }
