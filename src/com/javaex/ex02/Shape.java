/*Undone? 2021.11.30(화)16:49-17:05
 
[문제] com.javaex.ex02 패키지
클래스를 분석하여 출력결과를 예상하고 코딩 후 확인해 보세요.
(생성자 순서 파악 문제)

*/

package com.javaex.ex02;

public class Shape {
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
		System.out.println();
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println();
	}
}

