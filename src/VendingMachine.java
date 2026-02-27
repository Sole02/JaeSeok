import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 음료 목록
        System.out.println("사이다 1,700원 \n콜라 1,900원 \nt식혜 2,500원 \n솔의눈 3,000원");

        // 음료 선택
        System.out.println("어떤 음료를 구매하시겠습니까?");
        String drink = sc.next();

        int price = 0; // 음료 가격표

        // 음료 가격 설정
        if (drink.equals("사이다")) { price = 1700; }
        else if (drink.equals("콜라")) { price = 1900; }
        else if (drink.equals("식혜")) { price = 2500; }
        else if (drink.equals("솔의눈")) { price = 3000; }
        else {
            System.out.println("목록에 없는 음료입니다. 종료합니다.");
            return;
        }

        // 지불 금액 입력
        System.out.println("지불 금액");
        int money = sc.nextInt();

        if (money < price) {
            System.out.println("잔액 부족");
        } else {

        // 남은 잔액 확인
        int balance = money - price;
        System.out.println("잔액 " + balance + "원입니다.");
        }
    }
}
