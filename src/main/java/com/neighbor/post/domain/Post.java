package com.neighbor.post.domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
    private Long postId;        //게시글번호pk
    private Long memberId;      //작성자아이디fk
    private String title;       //제목
    private String content;     //내용
    private String postType;    //게시글타입
    private Date postDate;      //생성일자
    private Date postUpdate;    //수정일자
    private Long postView;      //조회수
}

