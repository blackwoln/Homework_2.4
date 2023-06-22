package pro.sky.blackwolncalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int additionNumbers( int num1, int num2) {
        return num1 + num2;
    }

    public int subtractionNumbers (int num1, int num2) {

        return num1 - num2;
    }

    public int multiplicationNumbers (int num1, int num2) {

        return num1 * num2;
    }

    public int divisionNumbers (int num1, int num2) {
        return num1 / num2;
    }
}
