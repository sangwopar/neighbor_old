package com.neighbor.member.domain;

import java.util.Date;

public class Member {
    private long memberId; //pk id
    private String memberName;      //닉네임
    private String memberPWD;       //pwd
    private String address;         //짧은주소
    private String addressDetail;   //전체주소
    private Date memberDate;        //가입날짜
    private String profileImg;      //프로필 이미지
    private String mbti;            //mbti;
    private int score;              //사용자평점
    private char memberStatus;      //회원상태(가입,탈퇴,정지등)

    public Member(long memberId, String memberName, String memberPWD, String address, String addressDetail, Date memberDate, String profileImg, String mbti, int score, char memberStatus) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPWD = memberPWD;
        this.address = address;
        this.addressDetail = addressDetail;
        this.memberDate = memberDate;
        this.profileImg = profileImg;
        this.mbti = mbti;
        this.score = score;
        this.memberStatus = memberStatus;
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

    public String getMemberPWD() {
        return memberPWD;
    }

    public void setMemberPWD(String memberPWD) {
        this.memberPWD = memberPWD;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public Date getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(Date memberDate) {
        this.memberDate = memberDate;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
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

    public char getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(char memberStatus) {
        this.memberStatus = memberStatus;
    }
}
