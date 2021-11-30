/*Undone? 2021.11.30(화)16:49-17:05
 
[문제] com.javaex.ex02 패키지
클래스를 분석하여 출력결과를 예상하고 코딩 후 확인해 보세요.
(생성자 순서 파악 문제)

*/

package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println();
	}
	
	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2)실행");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fiilColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4)실행");
	}
	
	
}


