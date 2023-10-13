package interfaceLearning.person;

public class pingpangSporter extends sporter implements English{

    public pingpangSporter(String name, int age) {
        super(name, age);
    }

    public pingpangSporter() {
    }

    @Override
    public void speakEnglish() {
        System.out.println("ピンポンアスリートが英語を話してる");
    }

    @Override
    public void study() {
        System.out.println("ピンポンアスリートがピンポンを勉強してる");
    }
}
