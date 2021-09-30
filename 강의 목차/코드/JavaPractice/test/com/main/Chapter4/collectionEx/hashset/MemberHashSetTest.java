package com.main.Chapter4.collectionEx.hashset;

import com.main.Chapter4.collectionEx.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberHashSetTest {

    MemberHashSet hashSet = new MemberHashSet();

    @BeforeEach
    void setUp() {
        // add 데이터 판단은 객체 hashCode로 판단하는듯 -> Equals로 확인
        // 객체인 경우 다른 객체이면 중복으로 판단을 하지 않는다
        // Member를 변경해야 함
        hashSet.addData(new Member(1, "Member1"));
        hashSet.addData(new Member(2, "Member2"));
        hashSet.addData(new Member(3, "Member3"));

    }

    @Test
    void addData() {
        hashSet.showAll();
        hashSet.addData(new Member(4, "Add Data Member 1"));
        hashSet.addData(new Member(3, "Add Data Member 2"));
        hashSet.showAll();
    }

    @Test
    void removeData() {
    }
}