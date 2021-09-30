package com.main.Chapter4.collectionEx;

public class Member implements Comparable<Member> { // , Comparator<Member>


    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public Member() {

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

    @Override
    public int compareTo(Member member) {

        System.out.println("(this.memberID - member.memberID) * (-1) = " + (this.memberID - member.memberID) * (-1));
        return (this.memberID - member.memberID) * (-1);
//        System.out.println("(this.memberID - member.memberID) = " + (this.memberID - member.memberID));
//        return (this.memberID - member.memberID);
    }

//    @Override
//    public int compare(Member o1, Member o2) { // Member now, Member to compare
//        // return o1.memberName.compareTo(o2.memberName);
//        return ((o1.getMemberID() - o2.getMemberID()) * (-1));
//    }
}
