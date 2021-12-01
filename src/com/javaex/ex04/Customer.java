/*2021.11.30(화)21:39, 2021.12.1(수)07:00 어떻게 배열로 할까 마지막 고민 중

[문제] com.javaex.ex04 패키지
클래스 다이어그램을 보고 클래스를 작성하세요. 
그리고 아래의 출력결과가 나오도록 UserApp.java를 프로그래밍 하세요.
(모든 고객과 직원은 하나의 배열로 관리합니다.)

*/

package com.javaex.ex04;

public class Customer extends User {
	
	//필드
	public int point;

	//생성자	
	public Customer(String id, String password, String name) {
		super(id, password, name);
	}

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	//메소드gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드:일반
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password + ", #이름:" + name + ", #포인트:" + point);
	}
	

}
