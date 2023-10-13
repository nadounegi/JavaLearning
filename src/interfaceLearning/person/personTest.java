package interfaceLearning.person;

public class personTest {
    public static void main(String[] args) {
        pingpangSporter ps = new pingpangSporter("张怡宁",43);
        System.out.println(ps.getName()+","+ps.getAge());
        ps.study();
        ps.speakEnglish();

    }
}
