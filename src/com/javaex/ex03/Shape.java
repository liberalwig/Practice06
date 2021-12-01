/*Undone/2021.11.30(화)17:08,21:14
[문제] com.javaex.ex03 패키지
아래의 코드는 오류가 있습니다. 오류의 원인을 찾고 Shape클래스를 수정하여 오류를 수정하세요.
(ShapeApp.java, Triangle.java 는 수정하지 말것)

//솔루션: (1)필드를 자식들은 접근할 수 있게 protected로 (2)getter 추가 (3)5랑 5가 가로,세로같은데

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
		
		public String getFillColor(String fillColor) {
			return fillColor;
		}
		
		public void setFillColor(String fillColor) {
			this.fillColor = fillColor;
		}
	
		public String getLineColor(String lineColor) {
			return lineColor;
		}
		
		public void setLineColor(String lineColor) {
			this.lineColor = lineColor;
		}
		
		public void showInfo() {
		}
	
	}

