package com.busa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator.calcPrint();
        Inputcalc oInputcalc= new Inputcalc();
//        Inputcalc sign = new Inputcalc();
//        Inputcalc num1 = new Inputcalc();
//        Inputcalc num2 = new Inputcalc();
        String sign= oInputcalc.getSign();
        int num1= oInputcalc.getNum1();
        int num2= oInputcalc.getNum2();

                //meghívom a calculator inputot osztályt
        //itt mentem el num1 num2
        //new Calculator(num1, num2); construktor paraméter java
        Calculator c0= new Calculator(2,3,"+");
        Calculator c1= new Calculator(num1, num2, sign);

    }
}