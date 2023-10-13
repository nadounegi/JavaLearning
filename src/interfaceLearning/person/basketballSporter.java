package interfaceLearning.person;

public class basketballSporter extends sporter {

    public basketballSporter(String name, int age) {
        super(name, age);
    }

    public basketballSporter() {
    }

    @Override
    public void study() {
        System.out.println("バスケットボールアスリートがバスケットボールを勉強してる");
    }
}
