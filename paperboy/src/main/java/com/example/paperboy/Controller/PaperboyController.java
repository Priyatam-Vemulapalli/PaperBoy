package com.example.paperboy.Controller;


import com.example.paperboy.ResponseBody.ArticleResponse;
import com.example.paperboy.Service.PaperboyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class PaperboyController {

    @Autowired
    PaperboyService paperboyService;

    @GetMapping("/get")
    public ArticleResponse getNews(@RequestParam("countryCode") String countryCode, @RequestParam("apiKey") String apiKey){
        return paperboyService.getNews(countryCode, apiKey);

    }

    @GetMapping("/get-topic")
    public Object getSpecificNews(@RequestParam("topic") String topic,
                                  @RequestParam("countryCode") String countryCode,
                                  @RequestParam("apiKey") String apiKey){
        return paperboyService.getSpecificNews(topic,countryCode,apiKey);
    }
}
