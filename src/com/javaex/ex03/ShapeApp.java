/*2021.11.30(화)17:08, 21:14
[문제] com.javaex.ex03 패키지
아래의 코드는 오류가 있습니다. 오류의 원인을 찾고 Shape클래스를 수정하여 오류를 수정하세요.
(ShapeApp.java, Triangle.java 는 수정하지 말것)

 */

package com.javaex.ex03;

public class ShapeApp {

	public static void main(String[] args) {
		
			Triangle t1 = new Triangle(5, 5);
			t1.setFillColor("빨강");
			t1.setLineColor("파랑");
			t1.showInfo();
			
	}

}


