package homework_2.complex_numbers;

public class ComplexNumberTest {
    public static void main(String[] args) {
        System.out.println("Создание комплексных чисел:");

        ComplexNumber complex = new ComplexNumber(7.8);

        ComplexNumber complex1 = new ComplexNumber(21.5, 3.5);
        ComplexNumber complex2 = new ComplexNumber(5.2, 15.2);

        System.out.println(complex);
        System.out.println(complex1);
        System.out.println(complex2);

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
