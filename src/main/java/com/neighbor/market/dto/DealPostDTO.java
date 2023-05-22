package com.neighbor.market.dto;

import java.util.Date;

public class DealPostDTO {
    private Long memberId; //작성자아이디
    private String region; //거래지역
    private String title; //제목
    private String content; //내용
    private Date createdAt; //생성일자
    private Date updateAt; //수정일자
    private Long postNum; //게시글번호
    private Long countNum; //조회수
    private int postType; //게시글타입
    
    //product 테이블 조인
    private Long productId; //상품아이디
    private String price; //상품가격
    private String productImage; //상품이미지
    //category 테이블 조인
    private String categoryName; //카테고리

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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

    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public DealPostDTO() {
    }

    public DealPostDTO(Long memberId, String region, String title, String content, Date createdAt, Date updateAt, Long postNum, Long countNum, int postType, Long productId, String price, String productImage, String categoryName) {
        this.memberId = memberId;
        this.region = region;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.postNum = postNum;
        this.countNum = countNum;
        this.postType = postType;
        this.productId = productId;
        this.price = price;
        this.productImage = productImage;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "DealPostDTO{" +
                "memberId=" + memberId +
                ", region='" + region + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", postNum=" + postNum +
                ", countNum=" + countNum +
                ", postType=" + postType +
                ", productId=" + productId +
                ", price='" + price + '\'' +
                ", productImage='" + productImage + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
