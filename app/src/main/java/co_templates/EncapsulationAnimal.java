package co_templates;

public class EncapsulationAnimal {
    public int firstNum;
    public int secondNum;
    public int result;
    // private int result;

    public void setResult(int number) {
        this.result = number;
    }

    public int getResult(){
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
