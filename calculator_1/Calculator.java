import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> result = new ArrayList<>();

    public int calculate(int num1, int num2, char op) {
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
        }
        this.result.add(result);
        return result;
    }
}
