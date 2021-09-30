package com.main.Chapter4.collectionEx.treemap;

import com.main.Chapter4.collectionEx.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberTreeMapTest {

    MemberTreeMap memberTreeMap = new MemberTreeMap();

    @BeforeEach
    void setUp() {
        // 이부분에서 key가 Integer가 있어서, Comparable 이 자동으로 수행되어, 정렬된 결과가 출력이 됨
        memberTreeMap.addMember(new Member(2, "Member2"));
        memberTreeMap.addMember(new Member(1, "Member1"));
        memberTreeMap.addMember(new Member(3, "Member3"));

    }

    @Test
    void addMember() {
        System.out.println("MemberTreeMapTest.addMember");
        memberTreeMap.showAll();
        memberTreeMap.addMember(new Member(4, "AddMember 1"));
        memberTreeMap.showAll();
    }

    @Test
    void removeMember() {
        System.out.println("MemberTreeMapTest.removeMember");
        memberTreeMap.showAll();
        memberTreeMap.removeMember(2);
        memberTreeMap.showAll();
    }
}