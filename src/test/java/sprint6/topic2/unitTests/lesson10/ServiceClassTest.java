package sprint6.topic2.unitTests.lesson10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class ServiceClassTest {
    @Mock
    ServiceClass serviceClass;

    @Test
    public void test() throws IOException {
        Server server = new Server();
        Mockito.when(serviceClass.sendGet(Mockito.anyString())).thenReturn(400);
        int responseCode = serviceClass.sendGet("http://www.example.com");
        String status = server.checkServer(responseCode);
        Assert.assertEquals("Сервер недоступен", status);
    }
}