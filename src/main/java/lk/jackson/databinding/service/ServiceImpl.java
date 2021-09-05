package lk.jackson.databinding.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lk.jackson.databinding.model.GetObject;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceImpl implements ServicesAPI {
    @Override
    public List<GetObject> getMethod() throws Exception {
        //List of Objects
        List<GetObject> list = new ArrayList<>();

        //Request URL
        String url = "https://reqres.in/api/users?page=2";

        //Creating HTTP Client.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //Parse the json to object.
            ObjectMapper objectMapper = new ObjectMapper();
            list = objectMapper.readValue(response.body(), new TypeReference<List<GetObject>>() {
            });
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error in parsing JSON to the object");
        }
        return list;
    }
}
