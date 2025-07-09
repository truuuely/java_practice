package com.codeit.practice3.run;

import com.codeit.practice3.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setEmpNo(100);
        em.setEmpName("홍길동");
        em.setDept("영업부");
        em.setJob("과장");
        em.setAge(25);
        em.setGender('남');
        em.setSalary(2500000);
        em.setBonusPoint(0.05);
        em.setPhone("010-1234-5678");
        em.setAddress("서울시 강남구");

        System.out.printf("사원번호 : %d, 이름 : %s, 부서 : %s, 직책 : %s\n", em.getEmpNo(), em.getEmpName(), em.getDept(), em.getJob());
        System.out.printf("나이 : %d, 성별 : %c, 월급 : %d, 보너스포인트(소수점 2자리까지) : %.2f\n", em.getAge(), em.getGender(), em.getSalary(), em.getBonusPoint());
        System.out.printf("휴대폰 : %s, 주소 : %s", em.getPhone(), em.getAddress());

    }
}
