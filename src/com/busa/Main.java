package com.busa;

import java.util.Scanner;
public class Main{
           public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input sign: ");
            String sign = in.toString();
            
            System.out.print("Input first number: ");
            int num1 = in.nextInt();

            System.out.print("Input second number: ");
            int num2 = in.nextInt();




            if (sign.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " +
                        (num1 + num2));
            } else if (sign.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " +
                    (num1 - num2));
            } else if (sign.equals("*")) {
                System.out.println(num1 + " x " + num2 + " = " +
                           (num1 * num2));
            }
            if (sign.equals("/")) {
                   System.out.println(num1 + " / " + num2 + " = " +
                           (num1 / num2));
               }
            if (sign.equals("%")){
                System.out.println(num1 + " mod " + num2 + " = " +
                           (num1 % num2));
               }


        }

    }