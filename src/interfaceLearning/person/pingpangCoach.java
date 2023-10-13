package interfaceLearning.person;

public class pingpangCoach extends coach implements English {

    public pingpangCoach(String name, int age) {
        super(name, age);
    }

    public pingpangCoach() {
    }

    @Override
    public void speakEnglish()
    {
        System.out.println("ピンポンコーチが英語を勉強してる");
    }

    @Override
    public void teach() {
        System.out.println("ピンポンコーチがピンポンを教えてる");
    }
}
