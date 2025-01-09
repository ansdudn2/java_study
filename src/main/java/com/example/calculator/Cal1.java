package com.example.calculator;

import com.sun.source.tree.ContinueTree;

import java.util.ArrayList;
import java.util.List;

public class Cal1 {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    private List<String> calculation;

    public Cal1() {
        //초기화
        calculation = new ArrayList<>();
    }
    //사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    public int calculate(int num1,int num2, char oper){
        int result;

        switch (oper){
            case '+':
                result = num1+num2;
                break;
            case '-' :
                result = num1-num2;
                break;
            case '*' :
                result = num1*num2;
                break;
            case '/' :
                if (num2!=0){
                    result = num1/num2;
                }else {
                    System.out.println("0으로 나눌수없습니다.");
                    return 0;
                }
                break;
            case  '%' :
                if (num2!=0){
                    result = num1%num2;
                }else {
                    System.out.println("0으로 나눌수없습니다.");
                    return 0;
                }
                break;
            default:
                System.out.println("사칙연산으로 입력해주세요");
                return 0;
        }
        calculation.add(num1+""+oper+""+num2+"="+result);
        return result;
    }
    //연산 기록 반환 메서드
    public List<String> getCalculation(){
        return calculation;
    }
    public static void main(String[] args) {
        Cal1 cal1 = new Cal1();
        System.out.println("결과="+cal1.calculate(5,7,'+'));
    }
}
