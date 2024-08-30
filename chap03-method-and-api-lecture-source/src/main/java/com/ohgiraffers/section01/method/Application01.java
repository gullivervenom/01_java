package com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {

        Calculator01 calc01 = new Calculator01();

        int a = 10;
        int b = 20;

        int sum = calc01.sumTwoNumbers(a, b);
        System.out.println("10과 20의 합 : = " + sum);

        int minus = calc01.minusTwoNumber(a,b );
        System.out.println("minus = " + minus);

    }

}
