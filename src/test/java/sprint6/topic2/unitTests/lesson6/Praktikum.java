package sprint6.topic2.unitTests.lesson6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Praktikum {
    @Mock
    Engine engine;

    @Test
    public void test() {
        Car car = new Car(engine);
        System.out.println(car.getEnginePower());
        Mockito.when(engine.getPower()).thenReturn(500);
        System.out.println(car.getEnginePower());
    }
}
