package com.greedy.level02.normal;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        RandomMaker randomMaker = new RandomMaker();



        Scanner sc = new Scanner(System.in);

        System.out.println("선택한 두 개의 숫자 사이를 랜덤으로 뽑아 드립니다 ^ㅡ^ : ");

        System.out.print("최소값 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("입력하신 숫자는 " + num1 + " 입니다. ");
        System.out.print("최대값 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("입력하신 숫자는 " + num2 + " 입니다. ");

        int result = randomMaker.randomNumber(num1, num2);
        System.out.println("결과 나왔습니다.. " + result );

//        4바이트  result 라는 공간 = 랜덤메이커 클래스.에 있는 메소드(우리가 적용을 하고자 하는) (적용을 원하는 숫자 두 개)
//        출력을 위한 soutv


//        System.out.print("랜덤한 문자열을 프린트합니다.");
//        String length = sc.nextLine();
//        System.out.println("입력하신 문장은 " + length + "입니다. ");
//        String result2 = randomMaker.randomUpperAlphabet(length);
//        System.out.println("결과 나왔습니다.. " + result2 );







    }
}
