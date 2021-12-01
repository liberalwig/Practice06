/* 2021.12.1(수)08:13

[문제] com.javaex.ex05 패키지
실행결과를 참조하여 Employee클래스를 상속받아 Depart클래스를 구현합니다. 
(Employee 와 EmployeeApp 클래스는 수정하지 않습니다.
Depart 클래스의 맴버변수는 String department 로 작성합니다.)

*/

package com.javaex.ex05;

public class Depart extends Employee {
	//필드작성(=멤버변수 작성)
	private String depart;

	//생성자 작성
	public Depart() {
		super();
	}

	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public void showInfo() {
		super.showInformation();
		System.out.println(" 부서:" + depart);
	}
	
}

//자식클래스Depart의 변수depart를 부모클래스Employee에 올릴 수 없으므로 Depart의 showInfo()에 쓰자
//자식클래스 showInfo란에 super.showInfo가 자동어 뜨길래 이건 줄 알았는데 아니라니

