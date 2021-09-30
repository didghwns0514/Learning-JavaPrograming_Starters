package com.main.Chapter4.collectionEx;

public class Member {


    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberID; //UUID.randomUUID().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Member)) { // 멤버값인지 먼저 체크해야 함!
            return false;
        } else {
            return ((Member) obj).memberID == this.memberID; // downCasting!
        }
    }

    @Override
    public String toString() {
        return "회원님의 ID 는 " + this.memberID + "," + "이름은 " + this.memberName + "입니다.";
    }
}
