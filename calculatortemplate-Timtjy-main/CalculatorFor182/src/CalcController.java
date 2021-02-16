import CalculatorView.CalculatorApp;
import Math.Calculations;
import Math.Formulas;
import Math.TriangleCalculator;
import Math.CircleCalculator;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;


public class CalcController {
    //View object
    private CalculatorApp calc;

    //models
    private Calculations calculations = new Calculations();
    private Formulas formulas = new Formulas();
    private TriangleCalculator triangleCalculator = new TriangleCalculator();
    private CircleCalculator circleCalculator = new CircleCalculator();
    /*Create a CircleCalculator here*/


    //Class Variables
    private String num1;
    private String num2;
    private String operation;
    int result;

    public CalcController(CalculatorApp gui){
        calc = gui;
    }

    public void initController(){
        calc.getOne().addActionListener(e-> simpleButtons("1"));
        calc.getTwo().addActionListener(e-> simpleButtons("2"));
        calc.getThree().addActionListener(e-> simpleButtons("3"));
        calc.getFour().addActionListener(e-> simpleButtons("4"));
        calc.getFive().addActionListener(e-> simpleButtons("5"));
        calc.getSix().addActionListener(e-> simpleButtons("6"));
        calc.getSeven().addActionListener(e-> simpleButtons("7"));
        calc.getEight().addActionListener(e-> simpleButtons("8"));
        calc.getNine().addActionListener(e-> simpleButtons("9"));
        calc.getZero().addActionListener(e-> simpleButtons("0"));
        calc.getClear().addActionListener(e-> calc.getCalcArea().setText(""));
        calc.getPlus().addActionListener(e-> operations("+"));
        calc.getMinus().addActionListener(e-> operations("-"));
        calc.getMultiply().addActionListener(e-> operations("*"));
        calc.getDivide().addActionListener(e-> operations("/"));
        calc.getEqual().addActionListener(e-> equalOperation());
        calc.getModulo().addActionListener(e->operations("modulo"));
        calc.getPythagorean().addActionListener(e->operations("Pytha"));
        calc.getCircumference().addActionListener(e -> operations("circumference"));
        calc.getCirclearea().addActionListener(e -> operations("circlearea"));
    }

    private boolean simpleButtons(String print){
        calc.getCalcArea().append(print);
        return true;
    }

    private int operations(String print){
        operation = print;
        num1 = calc.getCalcArea().getText();
        calc.getCalcArea().setText("");
        calc.getCalcArea().append(print);
        calc.getCalcArea().setText("");
        return Integer.parseInt(num1);
    }

    private boolean equalOperation(){
        num2 = calc.getCalcArea().getText();
        if(operation.equals("+")){
            result = (int) calculations.addition(Integer.parseInt(num1),Integer.parseInt(num2));
            calc.getCalcArea().setText(String.valueOf(result));
        }else if(operation.equals("-")){
            result = (int) calculations.subtraction(Integer.parseInt(num1),Integer.parseInt(num2));
            calc.getCalcArea().setText(String.valueOf(result));
        }else if(operation.equals("*")){
            result = (int) calculations.multiplication(Integer.parseInt(num1),Integer.parseInt(num2));
            calc.getCalcArea().setText(String.valueOf(result));
        }else if(operation.equals("/")){
            result = (int) calculations.division(Integer.parseInt(num1),Integer.parseInt(num2));
            calc.getCalcArea().setText(String.valueOf(result));
        }else if(operation.equals("modulo")){
            result = (int) calculations.modulo(Integer.parseInt(num1),Integer.parseInt(num2));
            calc.getCalcArea().setText(String.valueOf(result));
        }else if(operation.equals("Pytha")){
            String result;
            result = String.valueOf(triangleCalculator.pythaCSq(Double.parseDouble(num1),Double.parseDouble(num2)));
            calc.getCalcArea().setText(result);
        }else if(operation.equals("circumference")){
            String result;
            result = String.valueOf(circleCalculator.circumference(Double.parseDouble(num1)));
            calc.getCalcArea().setText(result);
        }else if(operation.equals("circlearea")){
            String result;
            result = String.valueOf(circleCalculator.circearea(Double.parseDouble(num1)));
            calc.getCalcArea().setText(result);
        }
        return true;
    }
}
