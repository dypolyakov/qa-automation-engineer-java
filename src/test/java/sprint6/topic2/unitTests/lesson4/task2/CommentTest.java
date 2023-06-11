package sprint6.topic2.unitTests.lesson4.task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sprint6.topic2.unitTests.lesson4.Comment;

@RunWith(MockitoJUnitRunner.class)
public class CommentTest {

    @Mock
    Comment comment;

    @Test
    public void test() {
        comment.updateText("");
        comment.updateText("");
        Mockito.verify(comment, Mockito.times(2)).updateText("");
    }

}
