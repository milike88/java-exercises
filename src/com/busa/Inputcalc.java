package com.busa;

import java.util.Scanner;

public class Inputcalc {
    String sign;
    int num1;
    int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Inputcalc (){

        Scanner in = new Scanner(System.in);

        System.out.print("Input sign: ");
        this.sign = in.nextLine();

        System.out.print("Input first number: ");
        this.num1 = in.nextInt();

        System.out.print("Input second number: ");
        this.num2 = in.nextInt();
    }
}

