/*2021.11.30(화)16:16

[문제] com.javaex.ex01 패키지
아래의 실행결과가 출력되도록 클래스 다이어그램을 보고 클래스를 작성하세요. 
(PersonApp.java 는 수정하지 않습니다.)

*/

package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {

		Person p = new Person("정우성", "010-1111-2222");
		Customer s = new Customer("유재석", "010-2222-3333", 1, 1000);
		
		p.showInfo();
		s.showInfo();
		
	}

}

