package org.example;

import static java.lang.Math.sqrt;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double squareroot(int a){
        return sqrt(a);
    }

    public int quadrate(int a){
        return a*a;

    }

    public float divide(int a, int b){
            if (b == 0) {
                throw new DivideByZeroException("Cannot divide by zero.");
            }
            return a / b;
        }
    public double sine(double degrees) {
        return Math.sin(degrees);
    }

    public double cosine(double degrees) {
        return Math.cos(degrees);
    }


}
