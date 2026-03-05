import java.util.Scanner;
import java.util.ArrayList;

public class AnimalCareSystem {

    String name;
    int age;
    int hunger;
    int happy;

    AnimalCareSystem(String name, int age, int hunger, int happy) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happy = happy;
    }

    void eat() {
        this.hunger -= 50;
    }

    void play() {
        this.happy += 30;
    }

    void info() {
        System.out.println("=== 동물 상태 조회 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("배고픔: " + hunger);
        System.out.println("만족도: " + happy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<AnimalCareSystem> animalList = new ArrayList<>();

        while (true) {
            System.out.println("=== 동물 관리 시스템 ===");
            System.out.println("1. 동물 등록\n2. 동물 목록\n3. 놀아주기\n4. 먹이주기\n5. 상태 확인\n6.울음소리\n7.종료\n 선택: ");
            int menu = sc.nextInt();

            if (menu == 7) {
                System.out.println("종료합니다.");
                break;
            } else if (menu == 1) {
                while (true) {
                    System.out.println("동물의 이름을 입력하세요.");
                    String animalName = sc.next();

                    System.out.println("동물의 나이를 입력하세요.");
                    int animalAge = sc.nextInt();

                    System.out.println("동물의 종류를 선택하세요. (1.강아지 2.고양이)");
                    int kind = sc.nextInt();
                    if (kind == 1) {
                        System.out.println("강아지가 선택되었습니다.");
                    } else if (kind == 2) {
                        System.out.println("고양이가 선택되었습니다.");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }

                    AnimalCareSystem Animalinfo = new AnimalCareSystem(animalName, animalAge, 80, 80);

                    System.out.println("(" + animalName + ", " + animalAge + "살" + ")이 등록 되었습니다.");
                    animalList.add(Animalinfo);
                    break;
                }
            } else if (menu == 2) {
                System.out.println("=== 동물 목록 ===");
                for (int i = 0; i < animalList.size(); i++) {
                    System.out.println((i + 1) + ". " + animalList.get(i).name);
                    break;
                }
            } else if (menu == 3) {
                System.out.println("놀아 주기");

            }
        }
    }
}
