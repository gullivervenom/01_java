package com.ohgiratters.section01.conditional;

import java.util.Scanner;

public class test {


//    public void testNestedIfStatement(){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print();
//
//
//        System.out.println("만약에 내 몸무게가" + weight + "kg 이 넘으면 샐러드를 먹겠지만, " +
//                "/n 그렇지 않고 치킨집이 문을" + opne + "했으면 치킨을 먹고 그렇지 않으면 라면을 먹겠어" );
//
//
//    }



public void test1() {

    Scanner sc = new Scanner(System.in);
    System.out.println("다람쥐가 축제 아르바이트를 시작했습니다.");
    System.out.println("맥주를 판매하려면 성인인지 확인을 해야 해요.");
    System.out.print("나이가 어떻게 되세요? ");
    int num = sc.nextInt();
    if(num >=19) {
        if (num >= 19) {
            System.out.println("판매 가능합니다.");
        }
    }
    else {
        System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
    }
}

public void test2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("람쥐가 이벤트 부스에서 짝홀 게임 진행을 맡았습니다.");
    System.out.print("짝홀, 그 결과는? ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
        System.out.println("짝수입니다.");
    } else {
        System.out.println("홀수입니다.");
    }
}

    public void test3(){
        System.out.println("랍쥐가 숫자 뽑기를 통해 선물을 나눠주는 이벤트 부스에서 일합니다.");

        Scanner sc = new Scanner(System.in);
        System.out.print("담청 번호가 어떻게 되세요? ");
        int num1 = sc.nextInt();
        if(num1 >= 1 && num1 <=10){

        if(num1 % 2 == 0){
            System.out.println("짝수네요, 모자 선물입니다!");
        }else  {
            System.out.println("홀수네요, 인형 선물입니다!");
        }
        }
        else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }

    }
    public void test4(){


    }
}