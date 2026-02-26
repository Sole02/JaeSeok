import java.util.Random;

    public class RandomName {

        private String[] List1 = {"기절초풍", "멋있는", "재미있는"};
        private String[] List2 = {"도전적인", "노란색의", "바보같은"};
        private String[] List3 = {"돌고래", "개발자", "오랑우탄"};

        public String createRandomName() {
            Random rand = new Random();
            int num1 = rand.nextInt(3);
            int num2 = rand.nextInt(3);
            int num3 = rand.nextInt(3);
            return List1[num1] + " " + List2[num2] + " " + List3[num3];
        }

        public static void main(String[] args) {
            RandomName randomname = new RandomName();
            String myname = randomname.createRandomName();
            System.out.println(myname);
        }
}