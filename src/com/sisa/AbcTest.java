package com.sisa;

public class AbcTest {

    public static void main(String[] args) {

        // 1️⃣ 기본 생성자 실행
        Abc obj1 = new Abc();

        // 2️⃣ int 생성자 실행
        Abc obj2 = new Abc(10.456);

        // 3️⃣ int + String 생성자 실행
        Abc obj3 = new Abc("안녕하세요",20);
    }
}
