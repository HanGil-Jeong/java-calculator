package com.example.calculator.lv2;

import java.util.ArrayList;

public class Calculator {

    // 결과 저장 - 캡슐화 컬렉션 타입
    ArrayList<Integer> results = new ArrayList<>();

    // 게터
    public ArrayList<Integer> getResults() {
        return results;
    }

    // 세터
    public void setResult(ArrayList<Integer> results) {
        this.results = results;
    }

    // 기능 : 사칙연산 수행
    public void sum(int num1, int num2, char operation) {
        int result = num1 + num2;
        results.add(result);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }

    public void sub(int num1, int num2, char operation) {
        int result = num1 - num2;
        results.add(result);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }

    public void mul(int num1, int num2, char operation) {
        int result = num1 * num2;
        results.add(result);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }

    public void div(int num1, int num2, char operation) {
        // 산술 예외 처리
        try {
            int result = num1 / num2;
            results.add(result);
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }

    public void removeList(Integer removeResult) {
        results.remove(removeResult);
    }
}
