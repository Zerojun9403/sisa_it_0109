package com.sisa;

public class Abc {
	int s;
    double a;
    String msg;

    // 기본 생성자
    public Abc() {
        System.out.println("기본 생성자 호출");
    }

    // int 하나 받는 생성자
    public Abc(double a) {
        this.a = a;
        System.out.println("double 생성자 호출: " + a);
    }

    // int + String 생성자
    public Abc( String msg, int s) {
        this.s = s;
        this.msg = msg;
        System.out.println("int, String 생성자 호출: " + s + ", " + msg);
    }
}
