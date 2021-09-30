package com.main.Chapter4.collectionEx.hashmap;

import com.main.Chapter4.collectionEx.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberHashMapTest {

    MemberHashMap memberHashMap = new MemberHashMap();

    @BeforeEach
    void setUp() {

        memberHashMap.addMember(new Member(1, "Member1"));
        memberHashMap.addMember(new Member(2, "Member2"));
        memberHashMap.addMember(new Member(3, "Member3"));

    }

    @Test
    void addMember() {
        System.out.println("MemberHashMapTest.addMember");
        memberHashMap.showAll();
        memberHashMap.addMember(new Member(4, "AddMember 1"));
        memberHashMap.showAll();
    }

    @Test
    void removeMember() {
        System.out.println("MemberHashMapTest.removeMember");
        memberHashMap.showAll();
        memberHashMap.removeMember(2);
        memberHashMap.showAll();
    }
}