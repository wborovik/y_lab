package homework_2.snils_validator;

public class SnilsValidatorTest {
    public static void main(String[] args) {
        System.out.println(new SnilsValidatorImpl().validate("01468870570"));
        System.out.println(new SnilsValidatorImpl().validate("90114404441"));

        System.out.println(new SnilsValidatorImpl().validate("005 360 004 87"));
        System.out.println(new SnilsValidatorImpl().validate(" 738 015 031 78"));
        System.out.println(new SnilsValidatorImpl().validate(" 699 9385g9 25 "));
    }
}
