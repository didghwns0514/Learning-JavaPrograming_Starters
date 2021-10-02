package com.main.Chapter4.exceptionEx;

class IDchecker extends Exception {

    public IDchecker(String message) {
        super(message); // 상속 Exception class constructor에 들어가는 메세지 초기화
    }

}


class IDdata {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDchecker {

        if (userID == null) {
            throw new IDchecker("아이디는 null 일 수 없습니다!");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDchecker("아이디 길이는 8이상 20이하여야 합니다.");
        }

        this.userID = userID;
    }
}


public class IDmakerTest {

    public static void main(String[] args) {

        String[] idList = new String[]{null, "1234567", "1234567890"};

        IDdata iDdata = new IDdata();

        for (String s : idList) {
            System.out.println("===============");
            System.out.println("s = " + s);
            try {
                iDdata.setUserID(s);
            } catch (IDchecker e) {
                System.out.println("e = " + e);
            }

        }

    }
}
