package pro.sky.blackwolncalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String additionNumbers( int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String subtractionNumbers (int num1, int num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }

    public String multiplicationNumbers (int num1, int num2) {
        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    public String divisionNumbers (int num1, int num2) {
        int sum = num1 / num2;
        return num1 + " / " + num2 + " = " + sum;
    }
}
