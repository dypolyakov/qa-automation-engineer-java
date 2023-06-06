package sprint6.topic2.unitTests.lesson10;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServiceClass {
    public int sendGet(String requestUrl) throws IOException {
        URL url = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        return connection.getResponseCode();
    }
}
