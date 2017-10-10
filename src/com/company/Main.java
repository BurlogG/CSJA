package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("lol");
        System.out.print(" ");
        byte num_0 = 2;   //types
        int i = 1999999999;
        long l = 1999999999;
        float num_2 = 324.234f;
        double num_3;
        num_3 = 2345.24234f;
        char sym = 'S';
        boolean is_happy = false;
        String str = "kek";
        System.out.println("Variable = " + num_0);

        System.out.println("Enter number ");

        Scanner num_4 = new Scanner(System.in); //int
        int j;
        j = num_4.nextInt();
        System.out.println("Variable: " + j);

        System.out.println("Enter word ");

        Scanner str1 = new Scanner(System.in); //string
        String symbols;
        symbols = str1.nextLine();
        System.out.println("Variable: " + symbols);

        System.out.println(" "); //-----------------------

        float num_5 = 23, num_6 = 32, res;
        res = num_5 + num_6; //math
        res++;           //+1
        System.out.println(res);

        System.out.println(" "); //-----------------------

        int g = 234;
        if (g != 234 && j == 3) {  //op condition
            System.out.println("yep");
        } else if (g > 100) {
            System.out.println("is bigger than 100");

        } else {
            System.out.println("nope");
        }

        System.out.println(" "); //-----------------------

        switch (j) { //switch
            case 12:
                System.out.println("j = 12");
                break;
            case 123:
                System.out.println("j = 123");
                break;
            case 3:
                System.out.println("good");
                if (j != 100)
                    System.out.println("ok");
                break;
            default:
                System.out.println("unknow");
        }
        for (int h = 1; h <= 10; h++)
            System.out.println("Element h is: " + h);
        System.out.println(" ");
        for (int h1 = 100; h1 >= 10; h1 -= 10)
            System.out.println("Element h is: " + h1);

        System.out.println(" "); //-----------------------

        int k = 0;
        while (k <= 15) {
            System.out.println("<< " + k);
            k++;
        }

        System.out.println(" "); //-----------------------

        int f = 100;
        do {
            System.out.println(">> " + f);
            f++;
        } while (f < 10);

        System.out.println(" "); //-----------------------

        //int [] arr = new int [3]; //array
        int[] arr = new int[]{56, 489, 325};
        //arr[0] = 23;
        //arr[2] = 657;
        System.out.println("arr " + arr[0] + " " + arr[1] + " " + arr[2]);

        System.out.println(" "); //-----------------------

        float[] arr1 = new float[]{56.2f, 489.5f, 325.5f, 678.654f};
        for (int u = 0; u < 4; u++) {
            System.out.println("arr " + u + " is " + arr1[u]);
        }

        System.out.println(" "); //-----------------------

        int[][] arr2 = new int[][]{ // 2d array
                {23, 78, 65, 78},
                {23, 78, 65, 78}
        };
        arr2[1][1] = 234;
        System.out.println("arrr " + arr2[1][1]);

        for (int y = 0; y < 2; y++) {
            for (int y1 = 0; y1 < 4; y1++) {
                System.out.print("arrr " + arr2[y][y1] + "   ");
            }
            System.out.println("");
        }

        System.out.println(" "); //-----------------------

        //functions - methods

        func(23, 74);
        int temp = func1(23, 74);
        System.out.println("Result 2 is: " + temp);

    }

    public static void func(int a, int b) {
        int res1;
        res1 = a + b;
        System.out.println("Result is: " + res1);
    }

    public static int func1(int a, int b) {
        int res1;
        res1 = a + b;
        return res1;
    }
}