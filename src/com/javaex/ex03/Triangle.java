/*2021.11.30(화)17:08, 21:14
[문제] com.javaex.ex03 패키지
아래의 코드는 오류가 있습니다. 오류의 원인을 찾고 Shape클래스를 수정하여 오류를 수정하세요.
(ShapeApp.java, Triangle.java 는 수정하지 말것)

 */

package com.javaex.ex03;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:"+fillColor);
		System.out.println("#선색:"+lineColor);
		System.out.println("#가로:"+width);
		System.out.println("#세로:"+height);
	}
}





