package uz.zako.json.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}

