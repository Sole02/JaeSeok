package AnimalCareSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo myZoo = new Zoo();

        while (true) {
            System.out.println("=== 동물 관리 시스템 ===");
            System.out.println("1.동물 등록\n2.동물 목록\n3.놀아주기\n4.먹이주기\n5.상태 확인\n6.울음소리\n0.종료\n선택: ");
            int menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("종료합니다.");
                break;
            } else if (menu == 1) {
                System.out.println("동물의 이름을 입력하세요.");
                String name = sc.next();
                System.out.println("동물의 나이를 입력하세요.");
                int age = sc.nextInt();
                System.out.println("동물의 종류를 선택하세요. (1.강아지, 2.고양이): ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    myZoo.addAnimal(new Dog(name, age));
                } else if (choice == 2) {
                    myZoo.addAnimal(new Cat(name, age));
                }
            } else if (menu == 2) {
                myZoo.showAnimalList();
            } else if (menu == 6) {
                myZoo.showAnimalList();
                System.out.println("울음소리를 들을 동물 번호를 선택하세요.");
                int select = sc.nextInt();
                myZoo.makeAnimalSound(select - 1);
            }
        }
    }
}