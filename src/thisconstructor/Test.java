package thisconstructor;

class Nani {
//    private Nani(){
//        System.out.println("hello");
//    }

    public Nani(){
        System.out.println("kkk");
    }
}

public class Test extends Nani{
    public Test() {
        super();
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
