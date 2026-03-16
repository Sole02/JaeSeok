package Chapter2.clazz;

public class main {

    public static void main(String[] args) {

        // 객체 생성 (인스턴스화)
        Person personA = new Person("Sol", 11);
        Person personB = new Person("Maehwa", 25);

        // 송성에 직접 접근
//        System.out.println("설정전 personA 이름: " + personA.name);
//        System.out.println("설정전 personB 이름: " + personB.name);
//        personA.name = "Sol";
//        personB.name = "Maehwa";
//        System.out.println("설정후 personA 이름: " + personA.name);
//        System.out.println("설정후 personB 이름: " + personB.name);


        // 기능 활용
        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 4);
        System.out.println("result1 = " + result1 );
        System.out.println("result2 = " + result2);

        // 게터 활용
        String name = personA.getName();
        System.out.println("name = " + name);

        // 세터 활용
        System.out.println("personA 의 주소: " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소: " + personA.address);


    }
}
