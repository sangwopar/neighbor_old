package com.neighbor.post.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private Long productId;     //상품아이디
    private Long postId;        //게시글아이디
    private Long categoryId;    //카테고리아이디
    private String price;       //가격
    private String productImg;  //상품이미지
}

