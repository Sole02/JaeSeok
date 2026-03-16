package Chapter1.io;

public class method {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(); // Calculator 객체 소환
        // Calculator(자료형) calculatr(변수명) = new(객체화) Calculator(자료형)
        // 해석 - 자료형을 변수명에 담고 자료형을 객체화 한다

        // 메서드(함수) 호출
        int a = calculator.sum(1, 2); // 호출부
        System.out.println("결과: " + a);





    }
}
