package com.sisa;

public class Abc {
	
	String str;
	int su;
	
	
	Abc(){
		// 주로 초기화(값할당) 와 관련된 코드 그리고 선행작업!! 
		// ==> 초기화란? 맴버변수(필드)에 대한 값 할당!!!!!
		str = "자바";
		su = 30;
		System.out.println("생성자");
	}
	
	void hello() {
		//지역변수선언, 지역변수초기화, 맴버변수초기화
		// 메서드 호출()
		// 조건문, 반복문
			System.out.println("Abc안녕하세요");
		
	}
}
