package AnimalCareSystem;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age, 80, 80, "고양이");
    }
    public void meow() {
        System.out.println(getName() + ": 야옹");
    }
}
