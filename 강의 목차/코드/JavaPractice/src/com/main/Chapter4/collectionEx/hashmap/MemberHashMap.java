package com.main.Chapter4.collectionEx.hashmap;

import com.main.Chapter4.collectionEx.Member;

import java.util.HashMap;

public class MemberHashMap {

    private final HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        this.hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (this.hashMap.containsKey(memberID)) {
            //this.hashMap.get(memberID); // 삭제가 아니고, 값을 가져오는 것
            this.hashMap.remove(memberID);
            return true;
        }

        System.out.println("Member dose not exist!");
        return false;

    }

    public void showAll() {
        for (Integer integer : hashMap.keySet()) {
            System.out.println("hashMap.get(integer) = " + hashMap.get(integer));

        }
        System.out.println("hashMap = " + hashMap);
    }

}
