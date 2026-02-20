package Chapter1.io;

public class GradeCalculator {

    public static void main(String[] args) {

        int[] scores = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }
        double average = 0.0;
        average = (double) total / scores.length;

        System.out.println(average + "점");

        if (average >= 90) {
            System.out.println("A급");
        } else if (average >= 80) {
            System.out.println("B급");
        } else if (average >= 70) {
            System.out.println("C급");
        } else if (average >= 60) {
            System.out.println("D급");
        } else {
            System.out.println("F급");
        }
    }
}