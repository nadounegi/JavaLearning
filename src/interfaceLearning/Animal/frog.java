package interfaceLearning.Animal;

public class frog extends animal implements Swiming {

    public frog(String name, int age) {
        super(name, age);
    }

    public frog() {
    }

    @Override
    public void swim() {
        System.out.println("カエルが泳いてる");
    }

    @Override
    public void eat() {
        System.out.println("カエルが虫を食べてる");
    }
}
