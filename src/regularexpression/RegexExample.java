package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String pattern = "^[0-9]*$"; // 숫자만
        String val = "123456789"; // 대상문자

        boolean regex = Pattern.matches(pattern, val);
        System.out.println(regex);

        Pattern p = Pattern.compile("^[a-zA-Z]*$"); // 영문자만
        val = "abcdef";

        Matcher matcher = p.matcher(val);
        System.out.println(matcher.find());

        //////////////////////////////////////////

        String name = "홍길동";
        String tel = "010-1234-5678";
        String email = "test@naver.com";

        // 유효성 검사.
        boolean name_check = Pattern.matches("^[가-힣]*$", name);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

        // 출력.
        System.out.println("이름 : " + name_check);
        System.out.println("전화번호 : " + tel_check);
        System.out.println("이메일 : " + email_check);
    }
}
