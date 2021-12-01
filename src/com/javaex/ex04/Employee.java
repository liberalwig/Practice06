/*2021.11.30(화)21:39, 2021.12.1(수)07:00 어떻게 배열로 할까 마지막 고민 중

[문제] com.javaex.ex04 패키지
클래스 다이어그램을 보고 클래스를 작성하세요. 
그리고 아래의 출력결과가 나오도록 UserApp.java를 프로그래밍 하세요.
(모든 고객과 직원은 하나의 배열로 관리합니다.)

*/

package com.javaex.ex04;

public class Employee extends User {
	//필드
	public int salary;
	
	//생성자
	public Employee(String id, String password, String name) {
		super(id, password, name);
	}

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	//메소드gs
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드일반
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password + ", #이름:" + name + ", #월급:" + salary);
		System.out.println("운영자의 월급은" + salary + "입니다.");
	}

	
}
