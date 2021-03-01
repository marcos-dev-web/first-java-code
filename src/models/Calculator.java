package models;

public class Calculator {
    private final double n1;
    private double n2;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double sum() {
        return this.n1 + this.n2;
    }

    public double times() {
        return this.n1 * this.n2;
    }

    public double divide() {
        if (this.n2 == 0) {
            this.n2 = 1;
        }
        return this.n1 / this.n2;
    }

    public double subtract() {
        return this.n1 - this.n2;
    }
}
