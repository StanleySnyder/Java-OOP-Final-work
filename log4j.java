import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicComplexCalculator implements ComplexCalculator {
    private static final Logger logger = LogManager.getLogger(BasicComplexCalculator.class);

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        logger.info("Выполнено сложение: {} + {} = {}", a, b, result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        logger.info("Выполнено умножение: {} * {} = {}", a, b, result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.divide(b);
        logger.info("Выполнено деление: {} / {} = {}", a, b, result);
        return result;
    }
}
