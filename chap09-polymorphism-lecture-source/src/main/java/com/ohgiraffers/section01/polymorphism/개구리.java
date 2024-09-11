package com.ohgiraffers.section01.polymorphism;

public class 개구리 extends 동물 {

    @Override
    public void 먹기() {
        System.out.println("개구리가 식탁에 앉아 메기를 먹습니다!!");
    }

    @Override
    public void 뛰기() {
        System.out.println("개구리가 폴~짝 뛰기 시작합니다");
    }

    @Override
    public void 낄낄거리기() {
        System.out.println("개굴개굴");
    }

    /* comment. 자식은 부모의 메소드 재정의 뿐만 아니라 본인의 기능도 가질 수 있다.*/
    public void 낼름공격(){
        System.out.println("개구리가 혓바닥으로 쎄게 내려칩니다!!!");
    }




}
/* title.  */
/* comment. */
/* index. */