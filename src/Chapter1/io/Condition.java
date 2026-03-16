package Chapter1.io;

public class Condition {

    public static void main(String[] args) {


        String light = "빨간불";

        if (light.equals("초록불")) {
            System.out.println("건너세요");

        } else if (light.equals("노란불")) {
            System.out.println("주의하세요");

        } else {
            System.out.println("멈추세요");
        }
        System.out.println("...");
    }
}
