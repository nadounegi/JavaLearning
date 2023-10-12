package interfaceLearning.Animal;

public class dog extends animal implements Swiming{

    public dog(String name, int age) {
        super(name, age);
    }

    public dog() {
    }

    @Override
    public void swim() {
        System.out.println("犬が泳いでる");
    }

    @Override
    public void eat() {
        System.out.println("犬が骨を食べてる");
    }
}
