/*2021.11.30(화)21:39, 2021.12.1(수)07:00-08:10 배열은 알겠는데 반복문으로 어찌 할까 마지막 고민 중

[문제] com.javaex.ex04 패키지
클래스 다이어그램을 보고 클래스를 작성하세요. 
그리고 아래의 출력결과가 나오도록 UserApp.java를 프로그래밍 하세요.
(모든 고객과 직원은 하나의 배열로 관리합니다.)

*/

package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer u1 = new Customer("jws", "j1234", "정우성", 1000);
		Customer u2 = new Customer("lhr", "l2345", "이효리", 2000);
		Employee u3 = new Employee("master", "7788","운영자", 5000000);		

		String[] UArray = new String[3];
		
		for(int i=0; i<UArray.length; i++) {
			UArray[i]= u(i+1);
			System.out.println(UArray[i]);
		}
		
		

	}
}
