package Chapter2.clazz;

public class Person {


    //속성
    String name;
    int age;
    String address;

    //생성자
//   기본 생성자: Person() {}
    // 생성자의 특징:
    // 1. 클래스와 이름이 같다.
    // 2. 반환 타입이 존재하지 않는다.
    // 3. 여러개가 존재할 수 있다.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 기능 (메서드 부분)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 게터 - 속성을 가져오는 기능
    String getName() {
        return this.name;
    }


    // 세터
    void setAddress(String address) {
        this.address = address;
    }






}
