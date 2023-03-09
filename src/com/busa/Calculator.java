package com.busa;

import java.util.Scanner;

public class Calculator {


    public Calculator(int num1, int num2, String sign) {

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input sign: ");
//        String sign = in.nextLine();
//
//        System.out.print("Input first number: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input second number: ");
//        int num2 = in.nextInt();
//        Inputcalc sign;
//        sign = new Inputcalc();
//        Inputcalc num1;
//        num1 = new Inputcalc();
//        Inputcalc num2;
//        num2 = new Inputcalc();
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(sign);
//        Inputcalc a= new Inputcalc();
//        Inputcalc b= new Inputcalc();
//        Inputcalc c= new Inputcalc();
//        String




        if (sign.equals("+")) {
            calcSum(num1, num2);
        } else if (sign.equals("-")) {
            calcDiv(num1, num2);
        } else if (sign.equals("*")) {
            calcMult(num1, num2);
        } else if (sign.equals("/")) {
            calcSub(num1, num2);
        } else if (sign.equals("%")) {
            calcPer(num1, num2);
        }
    }

    public int calcSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        return a + b;
    }

    public int calcDiv(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
        return a - b;
    }

    public int calcMult(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a * b));
        return a * b;
    }

    public int calcSub(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
        return a / b;
    }

    public int calcPer(int a, int b) {
        System.out.println(a + " mod " + b + " = " + (a % b));
        return a % b;
    }

    static void calcPrint() {
        System.out.println("it is calculator app");
    }
}


