package com.example.calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> results = new ArrayList<>();
    private int result;

    public void calculator(int firstNumber, int secondNumber, String operator) {
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                results.add(result);
                break;

            case "-":
                result = firstNumber - secondNumber;
                results.add(result);
                break;

            case "*":
                result = firstNumber * secondNumber;
                results.add(result);
                break;

            case "/":
                result = firstNumber / secondNumber;
                results.add(result);
                break;
        }
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + this.result);
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(int i, int newValue) {
        results.set(i, newValue);
    }

    public void remove() {
        results.remove(0);
    }
}
