package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ComplexCalculationService {
    public double add(int number1, int number2) {
        return Double.valueOf(number1) + Double.valueOf(number2);
    }

    public double subtract(int number1, int number2) {
        return Double.valueOf(number1) - Double.valueOf(number2);
    }

    public double multiply(int number1, int number2) {
        return Double.valueOf(number1) * Double.valueOf(number2);
    }

    public double divide(int number1, int number2) {
        return Double.valueOf(number1) / Double.valueOf(number2);
    }
}
