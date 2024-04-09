// - 두 정수 받아 사칙연산 중 (/, %) 결과 출력
// - *Main.java : call method 만 있음.
// - *InputOutput.java : 입력,출력 method
// - *Sub.java : 사칙연산 method, Set/Get 적용
// - try_catch 모든 method 사용 : 필요 시 대응문 적용
// 입력 예제) [3 / 0], [50 / 4]

package quests;

import java.util.HashMap;
import java.util.InputMismatchException;

public class EncapsulationSub {
    public int firstNum;
    public int secondNum;
    private int resultDivide;
    private int resultRest;

    // set method
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setResultDivide(int resultDivide) {
        this.resultDivide = resultDivide;
    }

    public void setResultRest(int resultRest) {
        this.resultRest = resultRest;
    }

    // get method
    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getResultDivide() {
        return resultDivide;
    }

    public int getResultRest() {
        return resultRest;
    }

    // 나눗셈
    public int encapsulationDivide(HashMap<String, Integer> inputValues) {
        try {
            int firstNumber = inputValues.get("firstNumber");
            int secondNumber = inputValues.get("secondNumber");
            setFirstNum(firstNumber);
            setSecondNum(secondNumber);

            setResultDivide(firstNumber / secondNumber);
        } catch (ArithmeticException e) { // 산술 연산에 대한 예외처리
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return resultDivide;
    }

    // 나머지
    public int encapsulationRest(HashMap<String, Integer> inputValues) {
        try {
            int firstNumber = inputValues.get("firstNumber");
            int secondNumber = inputValues.get("secondNumber");
            setFirstNum(firstNumber);
            setSecondNum(secondNumber);
            setResultRest(firstNumber % secondNumber);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return getResultRest();
    }
}