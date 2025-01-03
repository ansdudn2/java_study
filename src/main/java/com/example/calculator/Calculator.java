package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 첫번째정수를 입력해주세요.");
        double inputfir = sc.nextInt();
        String messege = "";
        do {
            System.out.println("양의 두번째정수를 입력해주세요.");
            double inputsec = sc.nextInt();
            System.out.println("사칙연산 기호를 입력해주세요.");
            char option = sc.next().charAt(0);
            double result = 0;
            switch (option) {
                case '+':
                    result = inputfir + inputsec;
                    break;
                case '-':
                    result = inputfir - inputsec;
                    break;
                case '*':
                    result = inputfir * inputsec;
                    break;
                case '/':
                    if (inputsec != 0) {
                        result = inputfir / inputsec;
                    } else {
                        System.out.println("0으로 나눌수없습니다.");
                        continue;
                    }
                    break;
                case '%':
                    if (inputsec != 0) {
                        result = inputfir % inputsec;
                    } else {
                        System.out.println("0으로 나눌수없습니다.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("사칙연산으로 입력해주세요");
                    continue;
            }
            System.out.println(result);
            inputfir = result;
            System.out.println("더 계산하시겟습니까?(exit 입력시 종료)");
            messege = sc.next();
        }while (!messege.equals("exit"));

    }
}
