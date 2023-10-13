package interfaceLearning.person;

public abstract class coach extends person{

    public coach(String name, int age) {
        super(name, age);
    }

    public coach() {
    }

    public abstract void teach();
}
