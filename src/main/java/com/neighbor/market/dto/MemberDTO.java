package com.neighbor.market.dto;

import java.util.Date;


public class MemberDTO {
    private long memberId;//id값, 진짜 아이디는 아님
    private String memberName;//진짜 닉네임
    private String memberPassword;
    private String profileImage;
    private String memberEmail;//아이디
    private String region;//주소
    private String addressDetail;//상세주소
    private Date createdAt;//아이디생성날짜
    private String mbti;
    private int score;//사용자점수
    private int memberOut;

    public MemberDTO() {
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", region='" + region + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", createdAt=" + createdAt +
                ", mbti='" + mbti + '\'' +
                ", score=" + score +
                ", memberOut=" + memberOut +
                '}';
    }

    public MemberDTO(long memberId, String memberName, String memberPassword, String profileImage, String memberEmail, String region, String addressDetail, Date createdAt, String mbti, int score, int memberOut) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPassword = memberPassword;
        this.profileImage = profileImage;
        this.memberEmail = memberEmail;
        this.region = region;
        this.addressDetail = addressDetail;
        this.createdAt = createdAt;
        this.mbti = mbti;
        this.score = score;
        this.memberOut = memberOut;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMemberOut() {
        return memberOut;
    }

    public void setMemberOut(int memberOut) {
        this.memberOut = memberOut;
    }
}