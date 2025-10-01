package com.example.calculator.lv2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int index;
        int newValue;
        String operator;
        String exit = "";
        int menu;

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println(":::: 계 산 기 ::::");
        while (!exit.equals("exit")) {

            while (true) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    firstNumber = sc.nextInt();
                    if (firstNumber < 0) {
                        System.out.println("양수만 입력가능합니다.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                    sc.nextLine();
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
                    if (secondNumber < 0) {
                        System.out.println("양수만 입력가능합니다.");
                        continue;
                    }

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

            // 계산 메서드
            calculator.calculator(firstNumber, secondNumber, operator);

            System.out.println(":::: M E N U ::::");
            System.out.println("1. 조회");
            System.out.println("2. 수정");
            System.out.println("3. 제거(과거순)");
            System.out.println("0. 없음");
            System.out.print("메뉴를 선택하세요: ");
            while (true) {
                menu = sc.nextInt();
                if (menu == 1 || menu == 2 || menu == 3 || menu == 0) {
                    break;
                }
                System.out.println("잘못누르셨습니다. 다시 입력해주세요.");
            }
            switch (menu) {

                // 모든 계산 결과 조회
                case 1:
                    List<Integer> results = calculator.getResults();
                    System.out.println("results = " + results);
                    break;

                // 계산 수정
                case 2:
                    List<Integer> resultList= calculator.getResults();
                    System.out.println("results = " + resultList);
                    System.out.print("수정할 값의 Index를 입력하세요: ");
                    index = sc.nextInt();
                    System.out.print("수정할 값을 입력하세요: ");
                    newValue = sc.nextInt();

                    calculator.setResults(index, newValue);
                    break;

                case 3:
                    calculator.remove();
                    List<Integer> removeAfterResults = calculator.getResults();
                    System.out.println("results = " + removeAfterResults);
                    break;

            }

            System.out.print("더 계산하시겠습니까? (exit입력 시 종료)");
            exit = sc.next();
        }

        sc.close();
    }
}
