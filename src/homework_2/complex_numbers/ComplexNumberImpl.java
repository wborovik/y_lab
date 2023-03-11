package homework_2.complex_numbers;

public class ComplexNumberImpl implements ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumberImpl(double real) {
        this.real = real;
    }

    public ComplexNumberImpl(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public ComplexNumberImpl plus(ComplexNumberImpl c2) {
        ComplexNumberImpl c1 = this;

        double real = c1.real + c2.real;
        double imaginary = c1.imaginary + c2.imaginary;

        return new ComplexNumberImpl(real, imaginary);
    }

    @Override
    public ComplexNumberImpl minus(ComplexNumberImpl c2) {
        ComplexNumberImpl c1 = this;

        double real = c1.real - c2.real;
        double imaginary = c1.imaginary - c2.imaginary;

        return new ComplexNumberImpl(real, imaginary);
    }

    @Override
    public ComplexNumberImpl multiplication(ComplexNumberImpl c2) {
        ComplexNumberImpl c1 = this;

        double real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginary = c1.imaginary * c2.real + c1.real * c2.imaginary;

        return new ComplexNumberImpl(real, imaginary);
    }

    @Override
    public double modulus() {
        return Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginary(), 2));
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        String result;

        if (imaginary == 0) {
            result = real + "";
        } else if (real == 0) {
            result = imaginary + "i";
        } else if (imaginary < 0) {
            result = real + " - " + (-imaginary) + "i";
        } else {
            result = real + " + " + imaginary + "i";
        }
        return result;
    }
}
