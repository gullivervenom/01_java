package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {


        /* title. 논리연산자의 우선순위에 대해 이해하고 활용해보자 */

        /* comment.
        *   논리 연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && 11순위
        *   || 12순위
        * */

        /* index. 1. 1부터 100사이의 값인지 확인 */
        int num1= 55;
        // 1<=num1 <=100; 한 번에 계산은 불가. 따로 따로 해야 한다.

        System.out.println("num1 이 1부터 100 사이인 지 확인 : " + (1<=num1 && num1<=100));

        /* index. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        System.out.println("ch1 이 영어 대문자인지 확인 : " + (ch1>= 'A' && ch1 <= 'Z'));

        /* 번외 */
        // a 는 대문자 A 보다 클까? -> 구글링 하지 말아보자. -> 형변환을 써보자
        char aTest = 'a';
        char ATest = 'A';
        // char 로는 문자 값이 확인되지 않기 때문에 int 로 변환해야 한다.
        int aToInt = aTest;
        System.out.println("aToInt = " + aToInt);
        int AtoInt = ATest;
        System.out.println("AtoInt = " + AtoInt);

        /* index. 3. 'f' 대소문자 상관 없이 영어인지 확인해보기  */
        // f 는 a ~ z 사이 이거나, A~Z 사이면 되지 않을까??
        char ch10 = 'ㅂ';
        int ㅂToInt = ch10;
        System.out.println("ㅂToInt = " + ㅂToInt);

        char ch2 = 'f';
        System.out.println("'f' 대소문자 상관 없이 영어인지 확인해보기 : " + (('a'<=ch2 && ch2<='z') || ('a'>=ch2 && ch2>='z')));
        System.out.println('a'+1);
        System.out.println('b'+1);
        System.out.println('c'+1);
        System.out.println('d'+1);
        System.out.println('d'); // 문자만 넣었을 때는 숫자로 값이 반환되지 않는다!!!!!!
        System.out.println('A'+1);
        System.out.println('B'+1);
        System.out.println('C'+1);
        System.out.println('D'+1);
        // 대문자보다 소문자가 숫자가 더 크다. A = 65 a= 97 알파벳이 한 단계씩 올라갈 때마다 숫자가 1씩 증가한다.














        /* title.  */
        /* comment. */
        /* index. */





    }
}
