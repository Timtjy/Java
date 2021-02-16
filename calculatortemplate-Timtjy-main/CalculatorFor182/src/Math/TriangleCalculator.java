package Math;

public class TriangleCalculator {

    Calculations calc = new Calculations();

    public TriangleCalculator(){

    }

    //Pythagorean theorem
    public double pythaCSq(double a, double b){
        //a^2 + b^2 = c^2
        double c = a*a+b*b;
        return calc.squareroot(c); ////////////////don't forget to change this
    }


}
