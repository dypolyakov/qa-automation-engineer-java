package sprint6.topic2.unitTests.lesson4.task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Praktikum {

    @Mock
    Comment comment;

    @Test
    public void test() {
        comment.updateText("Рецепт яблочного пирога");
        Mockito.verify(comment).updateText(Mockito.anyString());
    }
}
