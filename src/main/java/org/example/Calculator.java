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

    public double sinus(int a ){
        return Math.sin(a);

    }

    public double cosinus(int a ){
        return Math.cos(a);

    }
    public float divide(int a, int b){
            if (b == 0) {
                throw new DivideByZeroException("Cannot divide by zero.");
            }
            return a / b;
        }


}
