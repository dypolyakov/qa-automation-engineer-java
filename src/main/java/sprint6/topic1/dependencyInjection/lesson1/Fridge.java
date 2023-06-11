package sprint6.topic1.dependencyInjection.lesson1;

public class Fridge {
    // Зависимый класс
    public void openDoor() {
        HorizonLamp horizonLamp = new HorizonLamp();
        horizonLamp.switchLightOn();
    }
}
