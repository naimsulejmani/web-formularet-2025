package dev.naimsulejmani.webformularet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
    private String title;
    private String content;
    private String author;
    private LocalDateTime date;
    private String imageUrl;
    private String category;
}
