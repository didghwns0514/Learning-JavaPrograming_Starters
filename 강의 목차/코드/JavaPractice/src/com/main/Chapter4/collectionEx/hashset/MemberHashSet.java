package com.main.Chapter4.collectionEx.hashset;

import com.main.Chapter4.collectionEx.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    /*
     * HashSet의 add : 중복이면 메서드가 false return, 없는 값일 경우 true return
     * */
    private final HashSet<Member> hashSet = new HashSet<Member>();
    ;

    public MemberHashSet() {

    }


    public void addData(Member member) {

        this.hashSet.add(member);
    }

    public boolean removeData(Member member) {
        return false;
    }


    public void showAll() {
//        for (Member member : hashSet) {
//            System.out.println("member = " + member);
//        }
//        System.out.println("hashSet = " + hashSet);

        Iterator<Member> iterator = this.hashSet.iterator();
        while (iterator.hasNext()) {
            Member tempMember = iterator.next();
            System.out.println("tempMember = " + tempMember);
        }
    }

}
