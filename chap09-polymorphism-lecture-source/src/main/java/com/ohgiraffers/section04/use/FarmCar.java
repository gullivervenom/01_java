package com.ohgiraffers.section04.use;

// 경운기는 차의 기본적인 기능(가고, 서고) 할 수 있지만
// 경적을 울리는 기능은 없다.
public class FarmCar extends Car{


    @Override
    public void run() {
        System.out.println("경운기가 탈탈탈 가기 시작합니다. ");
    }

    @Override
    public void stop() {
        System.out.println("경운기가 멈춥니다. ");
    }
}
