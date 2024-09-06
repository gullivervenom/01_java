package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    //몬스터의 이름
    String name;
    // 몬스터의 체력
    int hp;

    public void setHp(int 전달받을매개변수) {
        if(전달받을매개변수 > 0){
            //this 는 인스턴스가 생성될 때 자신의 주소를 저장하는 레퍼런스 변수이다.
            //지역변수와 전역변수의 이름이 동일할 경우 지역변수를 우선 접근하기 때문에
            //전역변수에 접근하기 위해 this. 를 명시한다.

            System.out.println("정상적인 값이 들어와서 전달 값으로 몬스터의 체력을 설정합니다.");
            this.hp = 전달받을매개변수;
        }else{
            System.out.println("0보다 작거나 같은 값이 들어와서 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;
        }

    }

    /* title.  */
    /* comment. */
    /* index. */


}
/* title.  */
/* comment. */
/* index. */