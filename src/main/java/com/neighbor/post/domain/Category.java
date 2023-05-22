package com.neighbor.post.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long categoryId;        //카테고리아이디
    private String categoryName;    //카테고리이름
}
