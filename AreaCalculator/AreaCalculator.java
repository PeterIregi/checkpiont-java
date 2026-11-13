import java.lang.Math;
public class AreaCalculator {
    // Circle Pie rSquare
    public double calculate(double r){
        return Math.PI * r*r;
    }
    //Rectangle width x height
    public double calculate( double w, double h){
        return w * h;
    }
    //triangle
    public double calculate(double b, double h, boolean isTriangle){
        return 0.5 * b* h;
    }
    public double calculate(double s, boolean isSquare){
        return s * s;
    }
}