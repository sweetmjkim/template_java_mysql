package co_templates;

public class ConstructorMain {
    public static void main(String[] args) {
        ConstructorAnimal animal = new ConstructorAnimal();
        animal.animalSound();

        ConstructorAnimal animalWithParams = new ConstructorAnimal(2, 3);

        // animal.byPass(4, 5);
        // System.out.println("animal.firstNum : " + animal.firstNum);
        // System.out.println("animal.secondNum : " + animal.secondNum);
        // System.out.println("animal.result :" + animal.result);
        // animal.setResult(6);
        // System.out.println("animal.getResult() : " + animal.getResult());
        // System.out.println("++animal.result() : " + (++animal.result));
        return;
    }
}
