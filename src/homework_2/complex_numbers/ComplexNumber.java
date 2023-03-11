package homework_2.complex_numbers;

public interface ComplexNumber {
    ComplexNumberImpl plus(ComplexNumberImpl c2);
    ComplexNumberImpl minus(ComplexNumberImpl c2);
    ComplexNumberImpl multiplication(ComplexNumberImpl c2);
    double modulus();
}
