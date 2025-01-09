package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cal1 인스턴스 생성
        Cal1 cal1 = new Cal1();
        //첫번째 정수를입력
        System.out.println("양의 첫번째정수를 입력해주세요.");
        double inputfir = sc.nextDouble();
        String messege = "";
        //do-while 반복문 시작
        do {
            System.out.println("양의 두번째정수를 입력해주세요.");
            double inputsec = sc.nextDouble();
            System.out.println("사칙연산 기호를 입력해주세요.");
            char option = sc.next().charAt(0);
            //Cal클래스의 연산결과 받기
            double result = cal1.calculate(inputfir,inputsec,option);
            //계산결과가 0이아닌 유효결과일경우에만 출력
           if (result != 0);{
                System.out.println("결과"+result);
                inputfir=result; //반복문으로 계산을 더할시 결과값을 inputfir로만든후 계산
            }
            //계산을 더할지 물어보기
            System.out.println("더 계산하시겟습니까?(exit 입력시 종료)");
            messege = sc.next();
        }while (!messege.equals("exit"));//messege가 exit가아닐경우 반복
        //계산 기록 출력
        System.out.println("연산 기록:");
        for (String record : cal1.getCalculation()) {
            System.out.println(record);
        }
    }
}