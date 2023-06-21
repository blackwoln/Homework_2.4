package pro.sky.blackwolncalculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.greeting();
    }

    @GetMapping(path = "/calculator/plus")
    public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.additionNumbers(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String subtraction (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtractionNumbers(num1,num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplication (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplicationNumbers(num1,num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String division (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divisionNumbers(num1,num2);
    }
}
