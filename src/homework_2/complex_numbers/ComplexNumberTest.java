package homework_2.complex_numbers;

public class ComplexNumberTest {
    public static void main(String[] args) {
        System.out.println("Создание комплексных чисел:");

        ComplexNumberImpl complex = new ComplexNumberImpl(7.8);

        ComplexNumberImpl complex1 = new ComplexNumberImpl(21.5, 3.5);
        ComplexNumberImpl complex2 = new ComplexNumberImpl(5.2, 15.2);

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
