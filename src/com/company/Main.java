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

        Scanner num_4 = new Scanner(System.in); //int
            int j;
            j =num_4.nextInt();
            System.out.print("Variable: " + j);
        Scanner str1 = new Scanner(System.in); //string
            String symbols;
            symbols = str1.nextLine();
            System.out.println("Variable: " + symbols);

        float num_5 = 23 , num_6 = 32 , res;
        res=num_5+num_6; //math
        res++;           //+1
        System.out.println(res);

        int g = 234;
        if (g!=234 && j==3){  //ops
            System.out.println("yep");
        } else if (g>100) {
            System.out.println("is bigger than 100");

        } else {
            System.out.println("nope");
        }
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


    }
}