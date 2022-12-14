public class Ai95Calculator {
    double ai95Price = 46.35;
    double tax = 0.14;
    double fullai95Price = ai95Price * (1 + tax);

    public double calculate(double voulme) {
        return voulme * fullai95Price;
    }
}
