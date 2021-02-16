package Math;

public class Calculations {
    public double addition(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("Your sum is " + sum);
        return sum;
    }

    public double subtraction(double num1, double num2){
        double response = num1 - num2;
        System.out.println("Your value is " + response);
        return response;
    }

    public double multiplication(double num1, double num2){
        double value = num1 * num2;
        System.out.println("Your value is "+ value);
        return value;
    }

    public double division(double num1, double num2){
        double value = num1 / num2;
        System.out.println("Your value is " + value);
        return value;
    }

    public double modulo(double num1, double num2){
        double value = num1%num2;
        System.out.println("Your value is " + value);
        return value;
    }

    public double squaring(double num1){
        double value = num1 * num1;
        System.out.println("Your value is " + value);
        return value;
    }

    public double squareroot(double num1){
        double value =  Math.sqrt(num1);
        System.out.println("Your value is " + value);
        return value;
    }
}
