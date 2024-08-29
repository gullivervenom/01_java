package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {


        /* title. 여러 개의 전달 인자를 이용한 메소드 호출 테스트 */

//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(gender);

        /* index. 2. 여러 개의 매개변수를 가진 메소드 호출하기. */
        Application4 app4 = new Application4();
        app4.testArgsMethod("박재민", 20, '남');
//        app4.testArgsMethod(20, '남', "박재민"); // 값의 갯수는 맞지만, 순서가 다르게 전달되면 안된다.









    }
    /* index. 1. 여러 개의 전달인자를 받을 수 있는 메소드 만들기. */
    public void testArgsMethod(String name, int age, final char gender){

        /* comment.
        *   매개변수도 일종의 지역변수로 분류된다.
        *   매개변수 역시 상수의 의미를 가지는 final 키워드를 사용할 수 있다.
        *   (지역변수에 final 키워드를 붙이는 것과 동일하다.)
        * */
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age +
                "세 이며, 성별은 " + gender + "입니다.");



        /* title.  */
        /* comment. */
        /* index. */

        return; // void 형식에서는 return;이 자동으로 입력되어 굳이 쓰지 않아도 된다.




    }
    
    
    
}
