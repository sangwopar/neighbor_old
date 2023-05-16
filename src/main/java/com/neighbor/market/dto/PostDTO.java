package com.neighbor.market.dto;

import java.util.Date;

public class PostDTO {
    private Long userId; //작성자아이디
    private String region; //거래지역
    private String title; //제목
    private String content; //내용
    private Date createdAt; //생성일자
    private Date updateAt; //수정일자
    private Long postNum; //게시글번호
    private Long countNum; //조회수
    private String mbti; //mbti
    //

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Long getPostNum() {
        return postNum;
    }

    public void setPostNum(Long postNum) {
        this.postNum = postNum;
    }

    public Long getCountNum() {
        return countNum;
    }

    public void setCountNum(Long countNum) {
        this.countNum = countNum;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public PostDTO() {}

    public PostDTO(Long userId, String region, String title, String content, Date createdAt, Date updateAt, Long postNum, Long countNum, String mbti) {
        this.userId = userId;
        this.region = region;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.postNum = postNum;
        this.countNum = countNum;
        this.mbti = mbti;
    }
}
