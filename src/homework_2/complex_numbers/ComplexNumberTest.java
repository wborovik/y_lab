package homework_2.complex_numbers;

public class ComplexNumberTest {
    public static void main(String[] args) {
        System.out.println("Создание комплексных чисел:");

        ComplexNumber complex = new ComplexNumber(7.8);

        ComplexNumber complex1 = new ComplexNumber(21.5, 3.5);
        ComplexNumber complex2 = new ComplexNumber(5.2, 15.2);
        ComplexNumber complex3 = new ComplexNumber(0, 2.7);
        ComplexNumber complex4 = new ComplexNumber(14.2, -8.4);

        System.out.println(complex);
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);
        System.out.println(complex4);

        System.out.println("-------------------------");
        System.out.println("Операции над комплексными числами:");


        System.out.println("Сложение: " + complex1.plus(complex2));
        System.out.println("Вычитание: " + complex1.minus(complex2));
        System.out.println("Умножение: " + complex1.multiplication(complex2));

        System.out.println("-------------------------");
        System.out.println("Получение модуля комплексного числа:");
        System.out.println(complex1.modulus());
        System.out.println(complex2.modulus());
    }
}
