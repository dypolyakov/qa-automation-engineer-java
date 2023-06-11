package sprint6.topic2.unitTests.lesson2.task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class Praktikum {
    @Mock
    ArrayList<String> list;

    @Test
    public void test() {
        list.add("1");
        list.add("2");
        list.add("3");
    }
}
