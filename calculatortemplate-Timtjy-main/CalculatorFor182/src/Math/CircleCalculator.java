package Math;

public class CircleCalculator {
    public static final double pi = 3.14159;
    Calculations cal = new Calculations();

    public CircleCalculator(){}

    public double circumference (double r){
        double c = cal.multiplication(2*pi,r);
        return c;
    }

    public double circearea (double r){
        double pi_rt = Math.sqrt(pi);
        double s = cal.squaring(pi_rt*r);
        return s;
    }
}
