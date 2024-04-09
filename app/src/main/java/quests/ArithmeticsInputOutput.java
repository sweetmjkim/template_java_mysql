// - 두 정수 받아 사칙연산(+-*%나머지) 결과 출력
// - main엔 method call만 있음.
// - 입력,출력 기능 method로 작성
// - try_catch문 모든 method에 사용
// 입력 예제) [3 / 0], [50 / 4]

package quests;

import java.util.HashMap;
import java.util.Scanner;

public class ArithmeticsInputOutput {
    public HashMap<String, Integer> arithmeticsInput() { // 출력 메소드
        HashMap<String, Integer> inputValues = new HashMap<>(); // 입력된 값을 HaspMap으로 담음

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("firstNumber : ");
            int firstNumber = scanner.nextInt();
            System.out.print("secondNumber : ");
            int secondNumber = scanner.nextInt();

            inputValues.put("firstNumber", firstNumber);
            inputValues.put("secondNumber", secondNumber);

        } catch (Exception e) {
            System.out.println("catch (Exception e) : " + e.getMessage());
        }
        scanner.close();
        return inputValues;
    }

    // 출력 메소드
    public void arithmeticsOutput(int sum, int minus, int multiple, int divide, int rest) {
        System.out.println("sumResult: " + sum);
        System.out.println("Minus: " + minus);
        System.out.println("Multiplication: " + multiple);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + rest);
    }
}