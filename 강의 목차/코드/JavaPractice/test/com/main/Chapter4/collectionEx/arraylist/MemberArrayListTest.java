package com.main.Chapter4.collectionEx.arraylist;

import com.main.Chapter4.collectionEx.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberArrayListTest {

    static public MemberArrayList memberArrayList = new MemberArrayList();


    @BeforeEach
    void setUp() {
        Member member1 = new Member(1, "member1");
        Member member2 = new Member(2, "member2");
        Member member3 = new Member(3, "member3");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
    }

    @Test
    void assignArrayList() {

        memberArrayList.showAll();

    }

    @Test
    void addMember() {
    }

    @Test
    void removeMemberByID() {
        memberArrayList.showAll();
        memberArrayList.removeMemberByID(2);
        memberArrayList.showAll();
    }

    @Test
    void showAll() {
    }
}