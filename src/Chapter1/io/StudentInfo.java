package Chapter1.io;

public class StudentInfo {
        public static void main(String[] args) {

            // TODO: 학생 정보 변수들 선언 및 초기화
            String name = "이재석"; // 이름 입력
            int age = 25;      // 나이 입력
            double height = 184.2; // 키 입력
            char grade = '0';    // 학년 입력
            boolean isStudent = false; // 재학중 여부

            // TODO: 학생 정보 출력
            System.out.println("=== 학생 정보 ===");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age + "세");
            System.out.println("키: " + height + "cm");
            System.out.println("학년: " + grade + "학년");
            System.out.println("재학 여부: " + isStudent);
            // 출력 코드 작성
    }
}
