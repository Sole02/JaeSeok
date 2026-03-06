package AnimalCareSystem;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age, 80, 80, "강아지");
    }
    public void bark() {
        System.out.println(getName() + ": 왈왈");
    }
}
