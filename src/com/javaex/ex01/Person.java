/*2021.11.30(화)16:16

[문제] com.javaex.ex01 패키지
아래의 실행결과가 출력되도록 클래스 다이어그램을 보고 클래스를 작성하세요. 
(PersonApp.java 는 수정하지 않습니다.)

*/

package com.javaex.ex01;

public class Person {
	//필드
	protected String name;
	protected String hp;
	
	//생성자
	public Person() {		
	}
		
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	//메소드gs
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#이름:" + name + ", #핸드폰:" + hp);
	}
	
	
	
	
}
