package com.example.calculator.lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 0;
        int result;
        String operator;
        String exit = "";

        Scanner sc = new Scanner(System.in);

        System.out.println(":::: 계 산 기 ::::");
        while (!exit.equals("exit")) {

            while (true) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    firstNumber = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                    sc.nextLine(); // 잘못된 입력 버퍼 제거
                }
            }

            while (true) {
                System.out.print("사칙연산(+, -, *, /)을 입력하세요: ");
                operator = sc.next();
                if (operator.equals("+") || operator.equals("-") ||
                        operator.equals("*") || operator.equals("/")) {
                    break;
                } else {
                    System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                }
            }

            while (true) {
                try {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    secondNumber = sc.nextInt();

                    if (operator.equals("/") && secondNumber == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                    sc.nextLine();
                }
            }

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
                    result = firstNumber / secondNumber;
                    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
                    break;
            }

            System.out.print("더 계산하시겠습니까? (exit입력 시 종료)");
            exit = sc.next();
        }

        sc.close();
    }
}
