package homework_2.complex_numbers;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real) {
        this.real = real;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber plus(ComplexNumber c2) {
        ComplexNumber c1 = this;

        double real = c1.real + c2.real;
        double imaginary = c1.imaginary + c2.imaginary;

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber minus(ComplexNumber c2) {
        ComplexNumber c1 = this;

        double real = c1.real - c2.real;
        double imaginary = c1.imaginary - c2.imaginary;

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiplication(ComplexNumber c2) {
        ComplexNumber c1 = this;

        double real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginary = c1.imaginary * c2.real + c1.real * c2.imaginary;

        return new ComplexNumber(real, imaginary);
    }

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
