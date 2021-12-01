/*2021.11.30(화)21:39, 2021.12.1(수)07:00-08:10

[문제] com.javaex.ex04 패키지
클래스 다이어그램을 보고 클래스를 작성하세요. 
그리고 아래의 출력결과가 나오도록 UserApp.java를 프로그래밍 하세요.
(모든 고객과 직원은 하나의 배열로 관리합니다.)

*/

package com.javaex.ex04;

public class User {
	//필드
	protected String id;
	protected String password;
	protected String name;
	
	//생성자
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	//메소드gs
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//메소드일반
	public void showInfo() {
	}
	
	
}
