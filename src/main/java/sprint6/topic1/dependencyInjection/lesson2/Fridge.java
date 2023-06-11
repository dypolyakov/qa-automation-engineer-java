package sprint6.topic1.dependencyInjection.lesson2;

// зависимый класс
public class Fridge {

    private Lamp lamp;

    public Fridge(Lamp lamp) {
        this.lamp = lamp;
    }

    // метод открывает двери
    public void openDoor() {
        lamp.switchLightOn();

    }
}
