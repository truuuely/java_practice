package com.codeit.controller;

import com.codeit.model.Member;

public class MemberController {
    public static int MAX_SIZE = 10;    // 배열의 최대 크기
    private Member[] mArray = new Member[MAX_SIZE]; // 배열
    private int size;

    public int existMemberNum() {
        return size;
    }

    public boolean checkId(String inputId) {
        for (int i = 0; i < size; i++) {
            if (inputId.equals(mArray[i].getId())) {
                return true;
            }
        }
        return false;
    }

    public Member searchId(String id) {
        for (int i = 0; i < size; i++) {
            if (id.equals(mArray[i].getId())) {
                return mArray[i];
            }
        }

        return null;
    }

    public Member[] searchName(String name) {
        int cnt = 0;
        for (Member member : mArray) {
            if (member != null && member.getName().contains(name)) {
                cnt += 1;
            }
        }

        Member[] members = new Member[cnt];
        int i = 0;
        for (Member member : mArray) {
            if (member != null && member.getName().contains(name)) {
                members[i++] = member.clone();
            }
        }

        return members;
    }

    public Member[] searchEmail(String email) {
        int cnt = 0;
        for (Member member : mArray) {
            if (member != null && member.getEmail().contains(email)) {
                cnt += 1;
            }
        }

        Member[] members = new Member[cnt];
        int i = 0;
        for (Member member : mArray) {
            if (member != null && member.getEmail().contains(email)) {
                members[i++] = member.clone();
            }
        }

        return members;
    }


    public boolean insertMember(String id, String name, String password, String email, char gender, int age) {
        Member m = new Member(id, name, password, email, gender, age);
        mArray[size++] = m;

        return true;
    }

    public boolean updatePassword(String id, String password) {
        Member member = searchId(id);
        if (member == null) {
            return false;
        }

        member.setPassword(password);
        return true;
    }

    public boolean updateName(String id, String name) {
        Member member = searchId(id);
        if (member == null) {
            return false;
        }

        member.setName(name);
        return true;
    }

    public boolean updateEmail(String id, String email) {
        //이메일 변경 메서드
        Member member = searchId(id);
        if (member == null) {
            return false;
        }

        member.setEmail(email);
        return true;
    }

    public boolean delete(String id) {
        boolean success = false;
        int i = 0;
        for (i = 0; i < size; i++) {
            if (mArray[i] != null && mArray[i].getId().equals(id)) {
                mArray[i] = null;
                size -= 1;
                success = true;
                break;
            }
        }

        if (success) {
            for (int j = i; j < size; j++) { // size=6 , 3 삭제, i=4
                mArray[j] = mArray[j + 1];
            }

            mArray[size] = null;
        }

        return success;
    }

    public void delete() {
        //전체 회원을 삭제하는 메서드
        mArray = new Member[MAX_SIZE];
        size = 0;
    }

    public Member[] printAll() {
        Member[] members = new Member[size];
        for (int i = 0; i < size; i++) {
            members[i] = mArray[i].clone();
        }

        return members;
    }


    public void testInit() {
        insertMember("test1", "홍길동", "1234", "aaa@aaa.aaa", 'M', 33);
        insertMember("test2", "김길동", "4321", "bbb@bbb.bbb", 'M', 34);
        insertMember("test3", "최길동", "1234", "ccc@ccc.ccc", 'M', 28);
        insertMember("test4", "박길동", "4321", "ddd@ddd.ddd", 'M', 35);
        insertMember("test5", "이길순", "1234", "eee@eee.eee", 'F', 17);
        insertMember("test6", "박길순", "1234", "fff@fff.fff", 'F', 20);
        insertMember("test7", "임길동", "1234", "ggg@ggg.ggg", 'M', 26);
        insertMember("test8", "송길동", "4321", "hhh@hhh.hhh", 'M', 41);
        insertMember("test9", "정길순", "1234", "iii@iii.iii", 'F', 28);
        insertMember("test10", "양길동", "4321", "jjj@jjj.jjj", 'M', 23);
    }
}

