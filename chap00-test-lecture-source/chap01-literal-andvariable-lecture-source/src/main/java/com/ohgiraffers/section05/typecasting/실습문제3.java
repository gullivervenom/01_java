package com.ohgiraffers.section05.typecasting;

public class 실습문제3 {

    public static void main(String[] args) {

        float 국어점수  = 80.5f;
        float 수학점수  = 50.6f;
        float 영어점수  = 70.8f;
        System.out.println(국어점수+수학점수+영어점수+"점");
        System.out.println((국어점수+수학점수+영어점수)/3+"점");

       int 총점 = (int) (국어점수+수학점수+영어점수);
        System.out.println("총점 = " + 총점+"점");
       int 평균 = (int) ((국어점수+수학점수+영어점수) / 3 );
        System.out.println("평균 = " + 평균 + "점");




















    }
}
