package com.main.Chapter4.collectionEx.arraylist;

import com.main.Chapter4.collectionEx.Member;

import java.util.ArrayList;

public class MemberArrayList {

    ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<Member>();

    }

    public void addMember(Member member) {
        this.arrayList.add(member);
    }

    public boolean removeMemberByID(int memberID) {
        // for문으로 처리해도 무방
        // arrayList.removeIf(member -> member.getMemberID() == memberID);
        for (int i = 0; i < arrayList.size(); i++) {

            Member tempMember = arrayList.get(i);
            if (tempMember.getMemberID() == memberID) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println("Member not existing!");
        return false;
    }

    public void showAll() {
        for (Member member : arrayList) {
            System.out.println("member = " + member);
        }
        System.out.println("arrayList = " + arrayList);
    }

}
