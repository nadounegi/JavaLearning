package interfaceLearning.Animal;

import interfaceLearning.Animal.animal;

public class rabbit extends animal {

    public rabbit(String name, int age) {
        super(name, age);
    }

    public rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("兎がニンジンを食べてる");
    }
}
