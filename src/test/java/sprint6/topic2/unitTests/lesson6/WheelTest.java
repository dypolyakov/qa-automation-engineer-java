package sprint6.topic2.unitTests.lesson6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.SQLOutput;

@RunWith(MockitoJUnitRunner.class)
public class WheelTest {
    @Mock
    Wheel wheel;

    @Test
    public void test() {
        Car car = new Car(wheel);
        Mockito.when(wheel.countWheels(2, 2)).thenReturn(5);
        System.out.println(car.getWheelsCount(2, 2));
    }
}
