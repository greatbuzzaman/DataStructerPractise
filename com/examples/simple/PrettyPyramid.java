package com.examples.simple;

import java.util.Scanner;

public class PrettyPyramid {
    public static void buildPyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int nosRows = sc.nextInt();
        System.out.println("Do you want it upsidedown?(yes/no) : ");
        String option= sc.next();
       // boolean upside = sc.nextBoolean();
        System.out.println("Your Pyramid ");
        if (option.equalsIgnoreCase("yes")) {
            printUpside(nosRows);
        } else {
            printDown(nosRows);
        }
    }
    
    public void printHash(int n){
        int rowCount= 1;
        for (int i = n; i > 0; i--) {
            // printing spaces
            for (int j = i; j >1; j--) {
                System.out.print(" ");
            }
            for (int j = rowCount; j >= rowCount; j--) {
                System.out.print("#");
            }
            for (int j = 1; j <=rowCount - 1 ; j++) {
                System.out.print ("#");
            }
            System.out.println();
            // Incrementing the rowCount
            rowCount++;
        }
    }
    private static void printDown(int nosRows) {
        // TODO Auto-generated method stub
        int rowCount = nosRows;
        for (int i = 0; i < nosRows; i++) {
            // printing spaces
            for (int j = 1; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            // Incrementing the rowCount
            rowCount--;
        }
    }

    private static void printUpside(int nosRows) {
        // TODO Auto-generated method stub
        int rowCount = 1;
        for (int i = nosRows; i > 0; i--) {
            // printing spaces
            for (int j = 1; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            // Incrementing the rowCount
            rowCount++;
        }
    }
}
