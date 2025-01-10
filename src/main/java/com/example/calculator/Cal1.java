package com.example.calculator;

import com.sun.source.tree.ContinueTree;

import java.util.ArrayList;
import java.util.List;

public class Cal1 {
    // 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정
    private List<String> calcapsule = new ArrayList<>();

    //사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    public double calculate(double num1, double num2, char oper) {
        double result;

        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌수없습니다.");
                    return Double.NaN; // 에러 상황 시 NaN 반환
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("0으로 나눌수없습니다.");
                    return Double.NaN; // 에서 상황 시 NaN 반환
                }
                break;
            default:
                System.out.println("사칙연산으로 입력해주세요");
                return Double.NaN; // 잘못된 연산자 입력 시 NaN 반환
        }
        //캡슐화된 결과기록저장
        calcapsule.add(num1 + "" + oper + "" + num2 + "=" + result);
        return result;
    }

    // Getter 메서드
    public List<String> getCalcapsule() {
        return calcapsule;
    }

    // Setter 메서드 (수정)
    public void setCalcapsule(List<String> calcapsule) {
        this.calcapsule = calcapsule;
    }
    //저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현
    public void removeResult(){
        if (!calcapsule.isEmpty()){
            System.out.println("삭제된 기록="+calcapsule.remove(0));
        }else{
            System.out.println("삭제할 기록이 없습니다");
        }
    }
}