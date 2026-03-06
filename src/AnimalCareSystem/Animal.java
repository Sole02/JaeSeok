package AnimalCareSystem;

public class Animal {

    private String name;
    private int age;
    private int hunger;
    private int happy;
    private String kind;

    public Animal(String name, int age, int hunger, int happy, String kind) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happy = happy;
        this.kind = kind;
    }

    void eat() {
        this.hunger -= 50;
    }

    void play() {
        this.happy += 50;
    }

    void info() {
        System.out.println("=== 동물 상태 조회 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("배고픔: " + hunger);
        System.out.println("만족도: " + happy);
    }

    public String getName() {
        return this.name;
    }
    public String getKind() {
        return this.kind;
    }
    public int getAge() {
        return this.age;
    }
}