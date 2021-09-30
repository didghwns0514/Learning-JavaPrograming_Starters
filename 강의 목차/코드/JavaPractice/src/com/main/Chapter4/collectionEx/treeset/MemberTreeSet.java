package com.main.Chapter4.collectionEx.treeset;

import com.main.Chapter4.collectionEx.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    /*
     * HashSet의 add : 중복이면 메서드가 false return, 없는 값일 경우 true return
     * */
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<Member>();
    }


    public void addData(Member member) {

        this.treeSet.add(member);
    }

    public boolean removeData(Member member) {

        Iterator<Member> iterator = this.treeSet.iterator();

        while (iterator.hasNext()) {
            Member getIter = iterator.next();

            if (member.getMemberID() == getIter.getMemberID()) {
                this.treeSet.remove(getIter);
                return true;
            }
        }

        System.out.println("No member found!");
        return false;
    }


    public void showAll() {
        for (Member member : treeSet) {
            System.out.println("member = " + member);
        }
        System.out.println("treeSet = " + treeSet);
    }

}
