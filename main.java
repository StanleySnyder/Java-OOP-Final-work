public class Main {
    public static void main(String[] args) {
        // Создание калькулятора комплексных чисел
        ComplexCalculator calculator = new BasicComplexCalculator();

        // Примеры комплексных чисел
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        // Сложение
        ComplexNumber sum = calculator.add(a, b);
        System.out.println("Сумма: " + sum);

        // Умножение
        ComplexNumber product = calculator.multiply(a, b);
        System.out.println("Произведение: " + product);

        // Деление
        ComplexNumber quotient = calculator.divide(a, b);
        System.out.println("Частное: " + quotient);
    }
}
