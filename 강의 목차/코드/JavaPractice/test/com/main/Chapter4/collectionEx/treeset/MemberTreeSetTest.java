package com.main.Chapter4.collectionEx.treeset;

import com.main.Chapter4.collectionEx.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberTreeSetTest {

    MemberTreeSet memberTreeSet = new MemberTreeSet();

    @BeforeEach
    void setUp() {
        memberTreeSet.addData(new Member(1, "Member1"));
        memberTreeSet.addData(new Member(2, "Member2"));
        memberTreeSet.addData(new Member(3, "Member3"));
    }

    @Test
    void addData() {
        memberTreeSet.showAll();
        memberTreeSet.addData(new Member(4, "AddDataMember1"));
        memberTreeSet.showAll();
    }

    @Test
    void removeData() {
        memberTreeSet.showAll();
        memberTreeSet.removeData(new Member(3, "Member3"));
        memberTreeSet.showAll();
    }
}