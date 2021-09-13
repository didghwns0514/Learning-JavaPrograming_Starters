package com.main.Chapter2.schedulerEx;

import com.main.Chapter2.schedulerEx.interfaces.Scheduler;
import com.main.Chapter2.schedulerEx.source.LeastJob;
import com.main.Chapter2.schedulerEx.source.Priority;
import com.main.Chapter2.schedulerEx.source.RoundRobin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SchedulerTest {

    @Test
    @DisplayName("스케쥴러 테스트")
    public static void main(String[] args) {
        schedulerTest();
    }

    static void schedulerTest() {
        System.out.println("전화 상담 배분방식을 선택하세요 : R, L, P");

        try {
            int ch = System.in.read();
            Scheduler scheduler = null;
            switch (ch) {
                case 'R':
                case 'r':
                    scheduler = new RoundRobin();
                    break;
                case 'L':
                case 'l':
                    scheduler = new LeastJob();
                    break;
                case 'P':
                case 'p':
                    scheduler = new Priority();
                    break;
                default:
                    System.out.println("지원하지 않는 기능입니다!");
            }
            if (scheduler != null) {
                // 다형성에 인해서 가능한, 객체의 메서드가 불리도록 하게 됨
                scheduler.getNextCall();
                scheduler.sendCallToAgent();
            }
        } catch (Exception e) {
            System.out.println("error happened : " + e);
        }


    }
}
