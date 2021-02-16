import CalculatorView.CalculatorApp;

public class Main {
    public static void main(String[] args){
        CalculatorApp calculatorView = new CalculatorApp();
        CalcController controller = new CalcController(calculatorView);
        controller.initController();
    }
}
