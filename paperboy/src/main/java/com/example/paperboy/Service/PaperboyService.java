package com.example.paperboy.Service;


import com.example.paperboy.ResponseBody.ArticleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaperboyService {

    @Autowired
    RestTemplate restTemplate;

    String baseUrl = "https://newsapi.org/v2/top-headlines";
    String topicUrl = "https://newsapi.org/v2/everything";
    public ArticleResponse getNews(String countryCode,
                                   String apiKey){
        String url = prepareURL(countryCode, apiKey);
        return restTemplate.getForObject(url,ArticleResponse.class);
    }

    public String prepareURL(String countryCode, String apiKey){

        String url=baseUrl + "?country=" + countryCode + "&apiKey=" + apiKey;

        return url;
    }

    public Object getSpecificNews(String topic, String countryCode,
                                    String apiKey){

        String url = prepareURL(topic,countryCode,apiKey);
        return restTemplate.getForObject(url,Object.class);
    }
    public String prepareURL(String topic, String countryCode, String apiKey){

        String url = topicUrl + "?q=" + topic + "&apiKey=" + apiKey;
        return url;
    }
}
