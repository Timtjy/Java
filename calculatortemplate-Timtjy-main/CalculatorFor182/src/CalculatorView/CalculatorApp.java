package CalculatorView;

import javax.swing.*;
import java.awt.*;

public class CalculatorApp {
    private JFrame frame;
    private JButton one = makeButton("1");
    private JButton two = makeButton("2");
    private JButton three = makeButton("3");
    private JButton four = makeButton("4");
    private JButton five = makeButton("5");
    private JButton six = makeButton("6");
    private JButton seven = makeButton("7");
    private JButton eight = makeButton("8");
    private JButton nine = makeButton("9");
    private JButton zero = makeButton("0");
    private JButton plus = makeButton("+");
    private JButton minus = makeButton("-");
    private JButton multiply = makeButton("*");
    private JButton divide = makeButton("/");
    private JButton equal = makeButton("=");
    private JTextArea calcArea = new JTextArea(5,5);
    private JButton clear = makeButton("Clear");
    private JButton modulo = makeButton("modulo");
    private JButton pythagorean = makeButton("Pytha");
    private JButton circumference = makeButton("2Πr");
    private JButton circlearea = makeButton("Πr^2");

    public CalculatorApp(){
        frame = new JFrame("Calculator");
        frame.setSize(200,1000);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(calcArea, BorderLayout.NORTH);
        frame.getContentPane().add(initNumbPanel(), BorderLayout.CENTER);
        frame.getContentPane().add(clear,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.setFocusable(true);
        initCalcArea();
    }

    private JPanel initNumbPanel(){
        JPanel numbPanel = new JPanel();
        numbPanel.setLayout((new GridLayout(7,3)));
        numbPanel.add(one);
        numbPanel.add(two);
        numbPanel.add(three);
        numbPanel.add(four);
        numbPanel.add(five);
        numbPanel.add(six);
        numbPanel.add(seven);
        numbPanel.add(eight);
        numbPanel.add(nine);
        numbPanel.add(plus);
        numbPanel.add(zero);
        numbPanel.add(minus);
        numbPanel.add(multiply);
        numbPanel.add(divide);
        numbPanel.add(equal);
        numbPanel.add(modulo);
        numbPanel.add(pythagorean);
        numbPanel.add(circumference);
        numbPanel.add(circlearea);
        return numbPanel;

    }

    public JButton getOne(){ return one; }
    public JButton getTwo() { return two;}
    public JButton getThree() { return three; }
    public JButton getFour() { return four; }
    public JButton getFive() { return five; }
    public JButton getSix() { return six; }
    public JButton getSeven() { return seven; }
    public JButton getEight() { return eight; }
    public JButton getNine() { return nine; }
    public JButton getZero() { return zero; }
    public JButton getPlus() { return plus; }
    public JButton getMinus() { return minus; }
    public JButton getDivide() { return divide; }
    public JButton getMultiply() { return multiply; }
    public JButton getEqual() { return equal; }
    public JButton getClear() { return clear; }
    public JTextArea getCalcArea(){ return calcArea; }
    public JButton getModulo(){return modulo;}
    public JButton getPythagorean(){return pythagorean;}
    public JButton getCircumference() { return circumference;}
    public JButton getCirclearea(){return circlearea;}

    private JTextArea initCalcArea(){
        calcArea.setEditable(false);
        return calcArea;
    }

    private JButton makeButton(String label){
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(50,50));
        button.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
        button.setText(label);
        return button;
    }
}
