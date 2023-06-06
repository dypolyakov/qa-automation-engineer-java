package sprint6.topic2.unitTests.lesson7;

import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Cat cat = new Cat("Alice");
}
