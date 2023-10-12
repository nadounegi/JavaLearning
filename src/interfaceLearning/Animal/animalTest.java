package interfaceLearning.Animal;

public class animalTest {
    public static void main(String[] args) {
        //カエルのインスタンスを作成
        frog f = new frog("ぐアぐア",2);
        System.out.println("カエルの名前は"+f.getName()+" "+f.getAge()+"歳");
        f.eat();
        f.swim();
        //兎のインスタンスを作成
        rabbit r = new rabbit("セーラームーン", 2);
        System.out.println("兎の名前は"+f.getName()+" "+f.getAge()+"歳");
        r.eat();

        //犬のインスタンスを作成
        dog d = new dog("ポチキス", 2);
        System.out.println("犬の名前は"+f.getName()+" "+f.getAge()+"歳");
        d.eat();
        d.swim();

    }

}
