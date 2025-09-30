package com.example.calculator.lv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int result;
        String operator;
        String exit = "";

        Scanner sc = new Scanner(System.in);

        while (!exit.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstNumber = sc.nextInt();

            System.out.print("사칙연산(+, -, *, /)을 입력하세요: ");
            operator = sc.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            secondNumber = sc.nextInt();

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                    break;

                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                        break;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
            }
            System.out.print("더 계산하시겠습니까? (exit입력 시 종료)");
            exit = sc.next();

        }
    }
}
