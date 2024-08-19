package com.example.paperboy.ResponseBody;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArticleDTO {
    private String title;
    private String author;
    private String url;
}
