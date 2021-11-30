/*2021.11.30(화)16:16-깃허브 문제 해결-16:46

[문제] com.javaex.ex01 패키지
아래의 실행결과가 출력되도록 클래스 다이어그램을 보고 클래스를 작성하세요. 
(PersonApp.java 는 수정하지 않습니다.)

*/

package com.javaex.ex01;

public class Customer extends Person{
	//필드
	private int cNo;
	private int point;
	
	//생성자
	public Customer() {		
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	//메소드gs
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#이름:" + name + ", #핸드폰:" + hp + ", #고객번호:" + cNo + ", #포인트점수:" + point);
	}


	

	
}
