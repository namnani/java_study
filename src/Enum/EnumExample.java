package Enum;

/*
enum : 서로 연관된 상수들의 집합.
객체지향프로그래밍의 목적에 맞게, 데이터와 행위를 하나의 단위로 몰아넣게된다.
생성자의 접근제어자는 private이다.
서로 다른 상수 그룹에 대한 비교를 컴파일 시점에서 차단할 수 있다.
상수 그룹별로 클래스를 만든 효과를 enum도 갖는 것이다.

enum을 사용하는 이유.
1. 코드가 단순해진다.
2. 인스턴스 생성과 상속을 방지한다.
3. 키워드 enum을 사용하기 때문에, 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
 */
public class EnumExample {
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch (type) {
            case APPLE:
                System.out.println(type.getColor());
                break;
            case PEACH:
                System.out.println(type.getColor());
                break;
            case BANANA:
                System.out.println(type.getColor());
                break;
        }

        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit.getColor());
        }
    }
}

enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;

    private Fruit(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

enum COMPANY {
    GOOGLE, APPLE, ORACLE;
}
