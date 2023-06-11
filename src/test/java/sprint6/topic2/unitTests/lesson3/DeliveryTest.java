package sprint6.topic2.unitTests.lesson3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DeliveryTest {
    @Mock
    Delivery mockedDelivery;
    Delivery testDelivery = new Delivery();

    @Test
    public void test() {
        // Получаю значения из мока
        System.out.println(mockedDelivery.getDefaultName());
        System.out.println(mockedDelivery.getDefaultWeight());
        System.out.println(mockedDelivery.getDefaultImportanceState());

        // Получаю значения из реального объекта
        System.out.println(testDelivery.getDefaultName());
        System.out.println(testDelivery.getDefaultWeight());
        System.out.println(testDelivery.getDefaultImportanceState());
    }
}
