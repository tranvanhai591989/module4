package caculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public float calculation(String calculation, float num1, float num2) {
        float total = 0;
        switch (calculation) {
            case "Add":
                total = num1 + num2;
                break;
            case "Sub":
                total = num1 - num2;
                break;
            case "Mul":
                total = num1 * num2;
                break;
            case "Div":
                total = num1 / num2;
                break;
        }
        return total;
    }
}
