package com.main.Chapter2.schedulerEx.source;

import com.main.Chapter2.schedulerEx.interfaces.Scheduler;

public class Priority implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 skill이 가장 높은 상담원의 대기열에 앞에 우선 분배합니다");
    }
}
