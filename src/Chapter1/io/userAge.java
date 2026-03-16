package Chapter1.io;

import java.util.Scanner;

public class userAge {

    public static void main(String[] args) {

        Scanner Age = new Scanner(System.in);

        int inputAge = Age.nextInt();

        if (inputAge < 0 || inputAge > 100) {
            System.out.println("올바른 나이를 입력해 주세요.");
        }
        else if (inputAge > 14) {
            System.out.println("서비스 이용이 가능합니다.");
        }
        else {
            System.out.println("만 15세 미만은 이용할 수 없습니다.");
        }

    }
}
