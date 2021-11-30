/*Undone? 2021.11.30(화)16:49-17:05
 
[문제] com.javaex.ex02 패키지
클래스를 분석하여 출력결과를 예상하고 코딩 후 확인해 보세요.
(생성자 순서 파악 문제)

//예상: Shape2, Shape0, Triangle4그러나 공백2칸, Triangle4
*/

package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}

