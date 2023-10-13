package interfaceLearning.person;

public class basketballCoach extends coach{

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    public basketballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("バスケットボールコーチがバスケットボールを教えてる");
    }
}
