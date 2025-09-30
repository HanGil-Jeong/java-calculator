package com.example.calculator.lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입럭해주세요: ");
            int num1 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력해주세요: ");
            char operation = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2 = scanner.nextInt();

            switch (operation) {
                case '+':
                    calculator.sum(num1, num2, operation);
                    break;
                case '-':
                    calculator.sub(num1, num2, operation);
                    break;
                case '*':
                    calculator.mul(num1, num2, operation);
                    break;
                case '/':
                    calculator.div(num1, num2, operation);
                    break;
            }
            System.out.println(" 저장된 값 보기 (1 입력 시 실행)");
            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
            System.out.print("입력 : ");
            String answer = scanner.next();
            if (answer.equals("1")) {

                // 게터 활용
                ArrayList<Integer> results = calculator.getResults();
                System.out.println("results = " + results); // 리스트 값 출력
                System.out.print("삭제하시겠습니까?(yes/no 입력) : ");
                String answer2 = scanner.next();

                if (answer2.equals("yes")) {
                    System.out.print("삭제할 값을 입력하세요: ");
                    int removeResult = scanner.nextInt();
                    calculator.removeList(removeResult); // 삭제할 값 받아서 제거

                    ArrayList<Integer> results2 = calculator.getResults();
                    System.out.println("results = " + results2); // 제거한 값 확인
                    break;

                } else if (answer2.equals("no")) {
                    break;
                }

            } else if (answer.equals("exit")) {
                break;
            }
        }
    }
}
