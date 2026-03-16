package Chapter1.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 출력
        // println 사용
        System.out.println("Hello");
        System.out.println("Java");

        // print 사용
        System.out.print("안녕");
        System.out.print("자바");

        // 개행문자 포함 출력
        System.out.println("\nHello\nWorld");

        // 입력(Scanner)
        // 스캐너 객체를 스캐너형 박스(scanner)
        // Scanner (직업: 통역사) / sc (이름: 철수) / = (는) / new Scanner (새로 채용된 통역사다) / (System.in) (키보드 전담인)
        Scanner sc = new Scanner(System.in);

        // 문자열 입력받기
        System.out.print("문장을 입력");
        String sentence = sc.nextLine();
        System.out.println("sentence = " + sentence);

        // 정수형(int, long) 입력받기
        System.out.print("정수(int)를 입력");
        int intBox = sc.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력");
        long LongBox = sc.nextLong();
        System.out.println("LongBox = " + LongBox);

        // 소수점
        System.out.print("소수점(double) 입력");
        double doubleBox = sc.nextDouble();
        System.out.println("double = " + doubleBox);
    }
}
