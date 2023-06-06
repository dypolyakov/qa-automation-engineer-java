package sprint6.topic2.unitTests.lesson6;

public class Car {
    Engine engine;
    Wheel wheel;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getEnginePower() {
        return engine.getPower();
    }

    public int getWheelsCount(int frontWheels, int backWheels) {
        return wheel.countWheels(frontWheels, backWheels);
    }
}
