import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            System.out.println("=== Java 계산기 ===");
            System.out.println("1.계산기하기\n2.계산 이력 보기\n3.이력 지우기\n0.종료\n선택: ");
            int menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("종료합니다.");
                break;
            } else if (menu == 1) {
                while (true) {
                    try {
                        System.out.println("숫자를 입력하세요.");
                        result = sc.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("숫자만 입력할 수 있습니다.");
                        sc.nextLine();
                    }
                }

                while (true) {
                    System.out.println("연산자를 입력하세요.");
                    String op = sc.next();

                    if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%") || op.equals("^") || op.equals("sqrt"))) {
                        System.out.println("잘못된 연산자입니다, 다시 입력해주세요.");
                        continue;
                    }

                    String log = "";
                    if (op.equals("sqrt")) {
                        double beforResult = result;
                        result = Math.sqrt(result);
                        log = "sqrt(" + beforResult + ") = " + result;
                    } else {
                        double num2 = 0;
                        while (true) {
                            try {
                                System.out.println("숫자를 입력하세요.");
                                num2 = sc.nextDouble();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("숫자만 입력할 수 있습니다.");
                                sc.nextLine();
                            }
                        }

                        double beforeResult = result;   // 연산 기록 보관, 출력용
                        if (op.equals("+")) result += num2;
                        else if (op.equals("-")) result -= num2;
                        else if (op.equals("*")) result *= num2;
                        else if (op.equals("/")) {
                            if (num2 == 0) {
                                System.out.println("0으로 나눌 수 없습니다.");
                            }
                            result /= num2;
                        } else if (op.equals("%"))
                            result %= num2;
                        else if (op.equals("^")) {
                            result = Math.pow(result, num2);
                        }

                        log = beforeResult + " " + op + " " + num2 + " = " + result;
                    }

                    System.out.println("결과: " + log);
                    history.add(log);

                    boolean goMain = false;
                    while (true) {
                        System.out.println("계속 계산 하시겠습니까? (Y/N): ");
                        String choice = sc.next();
                        if (choice.equals("Y") || choice.equals("y")) {
                            break;
                        } else if (choice.equals("N") || choice.equals("n")) {
                            System.out.println("결과: " + result);
                            goMain = true;
                            break;
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                    if (goMain) break;
                }
            } else if (menu == 2) {
                System.out.println("--- 계산 이력 목록 ---");
                if (history.isEmpty()) {
                    System.out.println("기록이 없습니다.");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
            } else if (menu == 3) {
                history.clear();
                System.out.println("모든 이력을 삭제했습니다.");
            }
        }
        sc.close();
    }
}