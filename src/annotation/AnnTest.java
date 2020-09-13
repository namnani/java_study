package annotation;

@Maker(name = "nani")
public class AnnTest {

    public static void main(String[] args) {
        Class<AnnTest> obj = AnnTest.class;

        Maker maker = (Maker) obj.getAnnotation(Maker.class);

        System.out.println(maker);
        System.out.println("num : " + maker.num());
        System.out.println("name : " + maker.name());
        System.out.println("date : " + maker.date());
    }
}
