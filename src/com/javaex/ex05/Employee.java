/* 2021.12.1(수)08:13

[문제] com.javaex.ex05 패키지
실행결과를 참조하여 Employee클래스를 상속받아 Depart클래스를 구현합니다. 
(Employee 와 EmployeeApp 클래스는 수정하지 않습니다.
Depart 클래스의 맴버변수는 String department 로 작성합니다.)

*/

package com.javaex.ex05;

public class Employee {

    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showInformation() {
        System.out.println("이름:" + name + " 연봉:" + salary);
    }

}

//자식클래스Depart의 변수depart를 부모클래스Employee에 올릴 수 없으므로 Depart의 showInfo()에 쓰자
