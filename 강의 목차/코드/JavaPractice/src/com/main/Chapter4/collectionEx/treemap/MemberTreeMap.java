package com.main.Chapter4.collectionEx.treemap;

import com.main.Chapter4.collectionEx.Member;

import java.util.TreeMap;

public class MemberTreeMap {

    private final TreeMap<Integer, Member> treeMap = new TreeMap<Integer, Member>();

    public MemberTreeMap() {
    }


    public void addMember(Member member) {
        this.treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (this.treeMap.containsKey(memberID)) {
            //this.hashMap.get(memberID); // 삭제가 아니고, 값을 가져오는 것
            this.treeMap.remove(memberID);
            return true;
        }

        System.out.println("Member dose not exist!");
        return false;

    }

    public void showAll() {
        for (Integer integer : treeMap.keySet()) {
            System.out.println("treeMap.get(integer) = " + treeMap.get(integer));

        }
        System.out.println("treeMap = " + treeMap);
    }

}
