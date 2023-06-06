package sprint6.topic2.unitTests.lesson8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NameConverterTest {

    @Spy
    NameConverter nameConverter;

    @Test
    public void getFullNameByName() {
        nameConverter.getFullNameByName("Тамара");
        Mockito.verify(nameConverter, Mockito.times(1)).getFullName("Тамара", null);
    }

    @Test
    public void getFullNameBySurname() {
        nameConverter.getFullNameBySurname("Петрова");
        Mockito.verify(nameConverter, Mockito.times(1)).getFullName(null, "Петрова");
    }
}