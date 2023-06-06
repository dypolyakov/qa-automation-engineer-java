package sprint6.topic2.unitTests.lesson6.task1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FriendTest {
    @Mock
    List<String> list;

    @Test
    public void friendsTest() {
        Friend friend = new Friend(list);
        Mockito.when(friend.getFriendsCount()).thenReturn(100);
        Assert.assertEquals(100, friend.getFriendsCount());
    }
}