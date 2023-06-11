package sprint6.topic1.dependencyInjection.lesson2;

public class Example {
    public static void main(String[] args) {
        Lamp horizonLamp = new HorizonLamp();
        Fridge fridge = new Fridge(horizonLamp);
        fridge.openDoor();
    }
}
