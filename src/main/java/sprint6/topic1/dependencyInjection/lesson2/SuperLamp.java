package sprint6.topic1.dependencyInjection.lesson2;

public class SuperLamp implements Lamp {

    @Override
    public void switchLightOn() {
        System.out.println("Я включаю лампочку марки «Суперлампа» и сияю на ура!");
    }
}
