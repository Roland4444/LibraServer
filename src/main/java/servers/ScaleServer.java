package servers;

import abstractions.Logger;
import abstractions.Scale;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;

public class ScaleServer {
    public void initScalesMap(){
      ScalesMap = new HashMap<>();
      ScalesMap.put("igor1", "http://192.168.22.3:8080/api/get-weight?scaleId=1");
    };
    public ScaleServer(){
        initScalesMap();
    };
    Logger logger;
    public HashMap<String, String> ScalesMap;
    public Scale getScale(String id){
        return null;
    }
    public float getWeigth(String id) throws IOException, InterruptedException {
        var url = ScalesMap.get(id);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMinutes(2))
                .GET()
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode()==200)
            return Float.parseFloat(response.body());
        else return -1;
      }
}
