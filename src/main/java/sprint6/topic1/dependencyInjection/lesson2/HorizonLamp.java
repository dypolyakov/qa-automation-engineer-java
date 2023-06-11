package sprint6.topic1.dependencyInjection.lesson2;

// класс зависимости
public class HorizonLamp implements Lamp {
    // метод, который включает лампочку
    @Override
    public void switchLightOn() {
        System.out.println("Я включаю лампочку марки «Горизонт»");
    }
}
