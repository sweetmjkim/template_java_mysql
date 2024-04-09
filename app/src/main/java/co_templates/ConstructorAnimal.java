package co_templates;

public class ConstructorAnimal {
    public int firstNum;
    public int secondNum;
    private int result;

    public ConstructorAnimal() {
        System.out.println("ConstructorAnimal()");
    }

    public ConstructorAnimal(int firstNumber, int secondNumber) {
        System.out.println("ConstructorAnimal(int firstNumber, int secondNumber)");
        this.firstNum = firstNumber;
        this.secondNum = secondNumber;
    }

    public void setResult(int number) {
        this.result = number;
    }

    public int getResult() {
        return this.result;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void byPass(int firstNumber, int secondNumber) {
        this.firstNum = firstNumber;
        this.secondNum = secondNumber;
        this.result = firstNumber + secondNumber;
        // this.result = result;
        return;
    }
}
