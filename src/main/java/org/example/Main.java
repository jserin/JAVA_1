package org.example;

public class Main {
    public static void main(String[] args) {
        /* System.out.println("ㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ"); */
        /* int a = 5;
    int b = 10;
    int c;

    c = a;
    a = b;
    b = c;

    System.out.println(a);
    System.out.println(b); */
        /* int x = 10;
        System.out.println(x);
        System.out.println("x");
        System.out.println("x" + 10);
        System.out.println(x +10);

        System.out.println("x: " + (x + 2));
        System.out.println("x: " + (x - 2));
        System.out.println("x: " + (x * 2));
        System.out.println("x: " + (x / 2));
        System.out.println("x: " + (x % 2)); */

        /* int age = 35;
        System.out.println("당신의 나이 : " + age); */

        /* if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println(("미성년자입니다."));
        } */

        /*  // 청년 검사
        if (age >= 20 && age <= 34) {
            System.out.println("청년입니다.");
        } else {
            System.out.println("청년이 아닙니다.");
        } */

        /* 참,거짓 분류
        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b; // c = false

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참");
        }

        if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
            System.out.println("거짓");
        }

        if (10 != 10 || 10 < 2) {
            System.out.println("거짓");
        } */

        /* if 문제
// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

        int age = 30; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");
        // 구현시작
        // if 만 사용
        if (age < 60) {
            if (age <= 19) {
                System.out.println("할인대상 입니다.");
            }
            if (age > 19) {
                System.out.println("할인대상이 아닙니다.");
            }
        }
        if (age >= 60) {
            System.out.println("할인대상 입니다.");
        }

        // if else
        if (age <= 19) {
            System.out.println("할인대상 입니다.");
        } else if (age >= 60) {
            System.out.println("할인대상 입니다.");
        } else {
            System.out.println("할인대상이 아닙니다.");
        }

        // &&
        if (age > 19 && age < 60) {
            System.out.println("할인대상이 아닙니다.");
        } else {
            System.out.println("할인대상 입니다.");
        }

        // ||
        if (age <= 19 || age >= 60) {
            System.out.println("할인대상 입니다.");
        } else {
            System.out.println("할인대상이 아닙니다.");
        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
*/

        /* // 구구단 반복문x
        System.out.println("8 * 1 = 8");
        System.out.println("8 * 2 = 16");
        System.out.println("8 * 3 = 24");
        System.out.println("8 * 4 = 32");
        System.out.println("8 * 5 = 40");
        System.out.println("8 * 6 = 48");
        System.out.println("8 * 7 = 56");
        System.out.println("8 * 8 = 64");
        System.out.println("8 * 9 = 72");


        // 구구단 변수 사용
        int dan = 8;

        System.out.println(dan + " * 1 = 8");
        System.out.println(dan + " * 2 = 16");
        System.out.println(dan + " * 3 = 24");
        System.out.println(dan + " * 4 = 32");
        System.out.println(dan + " * 5 = 40");
        System.out.println(dan + " * 6 = 48");
        System.out.println(dan + " * 7 = 56");
        System.out.println(dan + " * 8 = 64");
        System.out.println(dan + " * 9 = 72");


        // 구구단 변수, 반복문 사용
        for (var i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
        */

        /*
        // while 사용
        while (i <= 1000) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }*/
        /*int dan = 8;
        for (int i = 0; i <= 1000; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }*/

        int i = -100;
        while (i <= 25) {
            System.out.println(i);
            i++;
        }
        System.out.println("----------------------------------------");
        int a = 100;
        while (a > 0) {
            System.out.println(a);
            a--;
        }

        System.out.println("----------------------------------------");
        for (int b = 100; b > 0; b--) {
            System.out.println(b);
        }

        System.out.println("0313 연습");

    }
}
