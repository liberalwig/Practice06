/*2021.11.30(화)17:08-왜 겟터는 없을까?
[문제] com.javaex.ex03 패키지
아래의 코드는 오류가 있습니다. 오류의 원인을 찾고 Shape클래스를 수정하여 오류를 수정하세요.
(ShapeApp.java, Triangle.java 는 수정하지 말것)

//필드를 자식들은 접근할 수 있게 protected로+Shape이 undefined래

 */

package com.javaex.ex03;

public class Shape {
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {	
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void showInfo() {
	}
	
}

