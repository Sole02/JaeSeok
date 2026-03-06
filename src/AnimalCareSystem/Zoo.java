package AnimalCareSystem;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animal = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animal.add(animal);
        System.out.println(animal.getName() + "이(가) 등록 되었습니다.");
    }

    public void showAnimalList() {
        System.out.println("=== 동물 목록 ===");
        for (int i = 0; i < animal.size(); i++) {
            Animal a = animal.get(i);
            System.out.println((i + 1) + ". " + a.getName() + "(" + a.getKind() + ", " + a.getAge() + "살)");
        }
    }

    public void makeAnimalSound(int index) {
        Animal a = animal.get(index);
        if (a instanceof Dog) {
            ((Dog) a).bark();
        } else if (a instanceof Cat) {
            ((Cat) a).meow();
        }
    }
}